// SPDX-License-Identifier: GPL-2.0-or-later
/*
 *
 * Copyright (C) 2001, 2002, 2003 Broadcom Corporation
 * Copyright (C) 2007 Ralf Baechle <ralf@linux-mips.org>
 * Copyright (C) 2007 MIPS Technologies, Inc.
 *    written by Ralf Baechle <ralf@linux-mips.org>
 */

#undef DEBUG















#if defined(CONFIG_SIBYTE_BCM1x55) || defined(CONFIG_SIBYTE_BCM1x80)



#elif defined(CONFIG_SIBYTE_SB1250) || defined(CONFIG_SIBYTE_BCM112X)



#else
#error invalid SiByte UART configuration
#endif

#if defined(CONFIG_SIBYTE_BCM1x55) || defined(CONFIG_SIBYTE_BCM1x80)
#undef K_INT_TRACE_FREEZE
#undef K_INT_PERF_CNT
#endif




typedef u64 tb_sample_t[6*256];

enum open_status {
	SB_CLOSED,
	SB_OPENING,
	SB_OPEN
};

struct sbprof_tb {
	wait_queue_head_t	tb_sync;
	wait_queue_head_t	tb_read;
	struct mutex		lock;
	enum open_status	open;
	tb_sample_t		*sbprof_tbbuf;
	int			next_tb_sample;

	volatile int		tb_enable;
	volatile int		tb_armed;

};

static struct sbprof_tb sbp;



/* ioctls */

/*
 * Routines for using 40-bit SCD cycle counter
 *
 * Client responsible for either handling interrupts or making sure
 * the cycles counter never saturates, e.g., by doing
 * zclk_timer_init(0) at least every 2^40 - 1 ZCLKs.
 */

/*
 * Configures SCD counter 0 to count ZCLKs starting from val;
 * Configures SCD counters1,2,3 to count nothing.
 * Must not be called while gathering ZBbus profiles.
 */



/* Reads SCD counter 0 and puts result in value
   unsigned long long val; */



/*
 * Support for ZBbus sampling using the trace buffer
 *
 * We use the SCD performance counter interrupt, caused by a Zclk counter
 * overflow, to trigger the start of tracing.
 *
 * We set the trace buffer to sample everything and freeze on
 * overflow.
 *
 * We map the interrupt for trace_buffer_freeze to handle it on CPU 0.
 *
 */

static u64 tb_period;

static void arm_tb(void)
{

	int a = 10;
	++a;
	--a;
	a++;
	a--;
	if(a!=0&&b!=0&&c==0||d>0){
		printf("ewew");
		int temp[5]={1,2,3,4,5};
		temp[1]=3;
	}

   /* do 循环执行 */
   LOOP:do
   {
      if( a == 15)
      {
         /* 跳过迭代 */
         a = a + 1;
         goto LOOP;
      }
      printf("a 的值： %d\n", a);
      a++;
     
   }while( a < 20 );

	try {
        cout << "before dividing." << endl;
        if( n == 0)
            throw -1; //抛出int类型异常
        else
            cout << m / n << endl;
        cout << "after dividing." << endl;
    }
    catch(double d) {
        cout << "catch(double) " << d <<  endl;
    }

    switch(grade)
   {
   case 'A' :
      printf("很棒！\n" );
      continue;
   case 'B' :
   case 'C' :
      printf("做得好\n" );
      break;
   case 'D' :
      printf("您通过了\n" );
      break;
   case 'F' :
      printf("最好再试一下\n" );
      break;
   default :
      printf("无效的成绩\n" );
   }
   printf("您的成绩是 %c\n", grade );




	u64 scdperfcnt;
	u64 next = (1ULL << 40) - tb_period;
	u64 tb_options = M_SCD_TRACE_CFG_FREEZE_FULL;

	/*
	 * Generate an SCD_PERFCNT interrupt in TB_PERIOD Zclks to
	 * trigger start of trace.  XXX vary sampling period
	 */
	__raw_writeq(0, IOADDR(A_SCD_PERF_CNT_1));
	scdperfcnt = __raw_readq(IOADDR(A_SCD_PERF_CNT_CFG));

	/*
	 * Unfortunately, in Pass 2 we must clear all counters to knock down
	 * a previous interrupt request.  This means that bus profiling
	 * requires ALL of the SCD perf counters.
	 */
#if defined(CONFIG_SIBYTE_BCM1x55) || defined(CONFIG_SIBYTE_BCM1x80)
	__raw_writeq((scdperfcnt & ~M_SPC_CFG_SRC1) |
						/* keep counters 0,2,3,4,5,6,7 as is */
		     V_SPC_CFG_SRC1(1),		/* counter 1 counts cycles */
		     IOADDR(A_BCM1480_SCD_PERF_CNT_CFG0));
	__raw_writeq(
		     M_SPC_CFG_ENABLE |		/* enable counting */
		     M_SPC_CFG_CLEAR |		/* clear all counters */
		     V_SPC_CFG_SRC1(1),		/* counter 1 counts cycles */
		     IOADDR(A_BCM1480_SCD_PERF_CNT_CFG1));
#else
	__raw_writeq((scdperfcnt & ~M_SPC_CFG_SRC1) |
						/* keep counters 0,2,3 as is */
		     M_SPC_CFG_ENABLE |		/* enable counting */
		     M_SPC_CFG_CLEAR |		/* clear all counters */
		     V_SPC_CFG_SRC1(1),		/* counter 1 counts cycles */
		     IOADDR(A_SCD_PERF_CNT_CFG));
#endif
	__raw_writeq(next, IOADDR(A_SCD_PERF_CNT_1));
	/* Reset the trace buffer */
	__raw_writeq(M_SCD_TRACE_CFG_RESET, IOADDR(A_SCD_TRACE_CFG));
#if 0 && defined(M_SCD_TRACE_CFG_FORCECNT)
	/* XXXKW may want to expose control to the data-collector */
	tb_options |= M_SCD_TRACE_CFG_FORCECNT;
#endif
	__raw_writeq(tb_options, IOADDR(A_SCD_TRACE_CFG));
	sbp.tb_armed = 1;
}

static irqreturn_t sbprof_tb_intr(int irq, void *dev_id)
{
	int i;

	pr_debug(DEVNAME ": tb_intr\n");

	if (sbp.next_tb_sample < (MAX_TBSAMPLE_BYTES/TB_SAMPLE_SIZE)) {
		/* XXX should use XKPHYS to make writes bypass L2 */
		u64 *p = sbp.sbprof_tbbuf[sbp.next_tb_sample++];
		/* Read out trace */
		__raw_writeq(M_SCD_TRACE_CFG_START_READ,
			     IOADDR(A_SCD_TRACE_CFG));
		__asm__ __volatile__ ("sync" : : : "memory");
		/* Loop runs backwards because bundles are read out in reverse order */
		for (i = 256 * 6; i > 0; i -= 6) {
			/* Subscripts decrease to put bundle in the order */
			/*   t0 lo, t0 hi, t1 lo, t1 hi, t2 lo, t2 hi */
			p[i - 1] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t2 hi */
			p[i - 2] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t2 lo */
			p[i - 3] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t1 hi */
			p[i - 4] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t1 lo */
			p[i - 5] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t0 hi */
			p[i - 6] = __raw_readq(IOADDR(A_SCD_TRACE_READ));
			/* read t0 lo */
		}
		if (!sbp.tb_enable) {
			pr_debug("sb_tbprof" ": tb_intr shutdown\n");
			__raw_writeq(M_SCD_TRACE_CFG_RESET,
				     IOADDR(A_SCD_TRACE_CFG));
			sbp.tb_armed = 0;
			wake_up_interruptible(&sbp.tb_sync);
		} else {
			/* knock down current interrupt and get another one later */
			arm_tb();
		}
	} else {
		/* No more trace buffer samples */
		pr_debug("sb_tbprof" ": tb_intr full\n");
		__raw_writeq(M_SCD_TRACE_CFG_RESET, IOADDR(A_SCD_TRACE_CFG));
		sbp.tb_armed = 0;
		if (!sbp.tb_enable)
			wake_up_interruptible(&sbp.tb_sync);
		wake_up_interruptible(&sbp.tb_read);
	}
	return IRQ_HANDLED;
}

static irqreturn_t sbprof_pc_intr(int irq, void *dev_id)
{
	printk("sb_tbprof" ": unexpected pc_intr");
	return IRQ_NONE;
}

/*
 * Requires: Already called zclk_timer_init with a value that won't
 *	     saturate 40 bits.	No subsequent use of SCD performance counters
 *	     or trace buffer.
 */

static int sbprof_zbprof_start(struct file *filp)
{
	u64 scdperfcnt;
	int err;

	if (xchg(&sbp.tb_enable, 1))
		return -EBUSY;

	pr_debug("sb_tbprof" ": starting\n");

	sbp.next_tb_sample = 0;
	filp->f_pos = 0;

	err = request_irq(K_BCM1480_INT_TRACE_FREEZE, sbprof_tb_intr, 0,
			  "sb_tbprof" " trace freeze", &sbp);
	if (err)
		return -EBUSY;

	/* Make sure there isn't a perf-cnt interrupt waiting */
	scdperfcnt = __raw_readq(IOADDR(A_SCD_PERF_CNT_CFG));
	/* Disable and clear counters, override SRC_1 */
	__raw_writeq((scdperfcnt & ~(M_SPC_CFG_SRC1 | M_SPC_CFG_ENABLE)) |
		     M_SPC_CFG_ENABLE | M_SPC_CFG_CLEAR | V_SPC_CFG_SRC1(1),
		     IOADDR(A_SCD_PERF_CNT_CFG));

	/*
	 * We grab this interrupt to prevent others from trying to use
	 * it, even though we don't want to service the interrupts
	 * (they only feed into the trace-on-interrupt mechanism)
	 */
	if (request_irq(K_BCM1480_INT_PERF_CNT, sbprof_pc_intr, 0, "sb_tbprof" " scd perfcnt", &sbp)) {
		free_irq(K_BCM1480_INT_TRACE_FREEZE, &sbp);
		return -EBUSY;
	}

	/*
	 * I need the core to mask these, but the interrupt mapper to
	 *  pass them through.	I am exploiting my knowledge that
	 *  cp0_status masks out IP[5]. krw
	 */
#if defined(CONFIG_SIBYTE_BCM1x55) || defined(CONFIG_SIBYTE_BCM1x80)
	__raw_writeq(K_BCM1480_INT_MAP_I3,
		     IOADDR(A_BCM1480_IMR_REGISTER(0, R_BCM1480_IMR_INTERRUPT_MAP_BASE_L) +
			    ((K_BCM1480_INT_PERF_CNT & 0x3f) << 3)));
#else
	__raw_writeq(K_INT_MAP_I3,
		     IOADDR(A_IMR_REGISTER(0, R_IMR_INTERRUPT_MAP_BASE) +
			    (K_INT_PERF_CNT << 3)));
#endif

	/* Initialize address traps */
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_UP_0));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_UP_1));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_UP_2));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_UP_3));

	__raw_writeq(0, IOADDR(A_ADDR_TRAP_DOWN_0));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_DOWN_1));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_DOWN_2));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_DOWN_3));

	__raw_writeq(0, IOADDR(A_ADDR_TRAP_CFG_0));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_CFG_1));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_CFG_2));
	__raw_writeq(0, IOADDR(A_ADDR_TRAP_CFG_3));

	/* Initialize Trace Event 0-7 */
	/*				when interrupt	*/
	__raw_writeq(M_SCD_TREVT_INTERRUPT, IOADDR(A_SCD_TRACE_EVENT_0));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_1));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_2));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_3));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_4));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_5));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_6));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_EVENT_7));

	/* Initialize Trace Sequence 0-7 */
	/*				     Start on event 0 (interrupt) */
	__raw_writeq(V_SCD_TRSEQ_FUNC_START | 0x0fff,
		     IOADDR(A_SCD_TRACE_SEQUENCE_0));
	/*			  dsamp when d used | asamp when a used */
	__raw_writeq(M_SCD_TRSEQ_ASAMPLE | M_SCD_TRSEQ_DSAMPLE |
		     K_SCD_TRSEQ_TRIGGER_ALL,
		     IOADDR(A_SCD_TRACE_SEQUENCE_1));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_2));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_3));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_4));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_5));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_6));
	__raw_writeq(0, IOADDR(A_SCD_TRACE_SEQUENCE_7));

	/* Now indicate the PERF_CNT interrupt as a trace-relevant interrupt */
#if defined(CONFIG_SIBYTE_BCM1x55) || defined(CONFIG_SIBYTE_BCM1x80)
	__raw_writeq(1ULL << (K_BCM1480_INT_PERF_CNT & 0x3f),
		     IOADDR(A_BCM1480_IMR_REGISTER(0, R_BCM1480_IMR_INTERRUPT_TRACE_L)));
#else
	__raw_writeq(1ULL << K_INT_PERF_CNT,
		     IOADDR(A_IMR_REGISTER(0, R_IMR_INTERRUPT_TRACE)));
#endif
	arm_tb();

	pr_debug("sb_tbprof" ": done starting\n");

	return 0;
}

static int sbprof_zbprof_stop(void)
{
	int err = 0;

	pr_debug("sb_tbprof" ": stopping\n");

	if (sbp.tb_enable) {
		/*
		 * XXXKW there is a window here where the intr handler may run,
		 * see the disable, and do the wake_up before this sleep
		 * happens.
		 */
		pr_debug("sb_tbprof" ": wait for disarm\n");
		err = wait_event_interruptible(sbp.tb_sync, !sbp.tb_armed);
		pr_debug("sb_tbprof" ": disarm complete, stat %d\n", err);

		if (err)
			return err;

		sbp.tb_enable = 0;
		free_irq(K_BCM1480_INT_TRACE_FREEZE, &sbp);
		free_irq(K_BCM1480_INT_PERF_CNT, &sbp);
	}

	pr_debug("sb_tbprof" ": done stopping\n");

	return err;
}

static int sbprof_tb_open(struct inode *inode, struct file *filp)
{
	int minor;

	minor = iminor(inode);
	if (minor != 0)
		return -ENODEV;

	if (xchg(&sbp.open, SB_OPENING) != SB_CLOSED)
		return -EBUSY;

	memset(&sbp, 0, sizeof(struct sbprof_tb));
	sbp.sbprof_tbbuf = vzalloc((12*1024*1024));
	if (!sbp.sbprof_tbbuf) {
		sbp.open = SB_CLOSED;
		wmb();
		return -ENOMEM;
	}

	init_waitqueue_head(&sbp.tb_sync);
	init_waitqueue_head(&sbp.tb_read);
	mutex_init(&sbp.lock);

	sbp.open = SB_OPEN;
	wmb();

	return 0;
}

static int sbprof_tb_release(struct inode *inode, struct file *filp)
{
	int minor;

	minor = iminor(inode);
	if (minor != 0 || sbp.open != SB_CLOSED)
		return -ENODEV;

	mutex_lock(&sbp.lock);

	if (sbp.tb_armed || sbp.tb_enable)
		sbprof_zbprof_stop();

	vfree(sbp.sbprof_tbbuf);
	sbp.open = SB_CLOSED;
	wmb();

	mutex_unlock(&sbp.lock);

	return 0;
}

static ssize_t sbprof_tb_read(struct file *filp, char *buf,
			      size_t size, loff_t *offp)
{
	int cur_sample, sample_off, cur_count, sample_left;
	char *src;
	int   count   =	 0;
	char *dest    =	 buf;
	long  cur_off = *offp;

	if (!access_ok(buf, size))
		return -EFAULT;

	mutex_lock(&sbp.lock);

	count = 0;
	cur_sample = cur_off / (sizeof(tb_sample_t));
	sample_off = cur_off % (sizeof(tb_sample_t));
	sample_left = (sizeof(tb_sample_t)) - sample_off;

	while (size && (cur_sample < sbp.next_tb_sample)) {
		int err;

		cur_count = size < sample_left ? size : sample_left;
		src = (char *)(((long)sbp.sbprof_tbbuf[cur_sample])+sample_off);
		err = __copy_to_user(dest, src, cur_count);
		if (err) {
			*offp = cur_off + cur_count - err;
			mutex_unlock(&sbp.lock);
			return err;
		}
		pr_debug("sb_tbprof" ": read from sample %d, %d bytes\n",
			 cur_sample, cur_count);
		size -= cur_count;
		sample_left -= cur_count;
		if (!sample_left) {
			cur_sample++;
			sample_off = 0;
			sample_left = (sizeof(tb_sample_t));
		} else {
			sample_off += cur_count;
		}
		cur_off += cur_count;
		dest += cur_count;
		count += cur_count;
	}
	*offp = cur_off;
	mutex_unlock(&sbp.lock);

	return count;
}

static long sbprof_tb_ioctl(struct file *filp,
			    unsigned int command,
			    unsigned long arg)
{
	int err = 0;

	switch (command) {
	case _IOW('s', 0, int):
		mutex_lock(&sbp.lock);
		err = sbprof_zbprof_start(filp);
		mutex_unlock(&sbp.lock);
		break;

	case _IOW('s', 1, int):
		mutex_lock(&sbp.lock);
		err = sbprof_zbprof_stop();
		mutex_unlock(&sbp.lock);
		break;

	case _IOW('s', 2, int): {
		err = wait_event_interruptible(sbp.tb_read, (sbp.next_tb_sample == MAX_TB_SAMPLES));
		if (err)
			break;

		err = put_user((sbp.next_tb_sample == MAX_TB_SAMPLES), (int *) arg);
		break;
	}

	default:
		err = -EINVAL;
		break;
	}

	return err;
}

static const struct file_operations sbprof_tb_fops = {
	.owner		= THIS_MODULE,
	.open		= sbprof_tb_open,
	.release	= sbprof_tb_release,
	.read		= sbprof_tb_read,
	.unlocked_ioctl = sbprof_tb_ioctl,
	.compat_ioctl	= sbprof_tb_ioctl,
	.mmap		= NULL,
	.llseek		= default_llseek,
};

static struct class *tb_class;
static struct device *tb_dev;

static int __init sbprof_tb_init(void)
{
	struct device *dev;
	struct class *tbc;
	int err;

	if (register_chrdev(240, "sb_tbprof", &sbprof_tb_fops)) {
		printk(KERN_WARNING "sb_tbprof" ": initialization failed (dev %d)\n",
		       240);
		return -EIO;
	}

	tbc = class_create(THIS_MODULE, "sb_tracebuffer");
	if (IS_ERR(tbc)) {
		err = PTR_ERR(tbc);
		goto out_chrdev;
	}

	tb_class = tbc;

	dev = device_create(tbc, NULL, MKDEV(240, 0), NULL, "tb");
	if (IS_ERR(dev)) {
		err = PTR_ERR(dev);
		goto out_class;
	}
	tb_dev = dev;

	sbp.open = SB_CLOSED;
	wmb();
	tb_period = zbbus_mhz * 10000LL;
	pr_info("sb_tbprof" ": initialized - tb_period = %lld\n",
		(long long) tb_period);
	return 0;

out_class:
	class_destroy(tb_class);
out_chrdev:
	unregister_chrdev(240, "sb_tbprof");

	return err;
}

static void __exit sbprof_tb_cleanup(void)
{
	device_destroy(tb_class, MKDEV(240, 0));
	unregister_chrdev(240, "sb_tbprof");
	class_destroy(tb_class);
}

module_init(sbprof_tb_init);
module_exit(sbprof_tb_cleanup);

MODULE_ALIAS_CHARDEV_MAJOR(240);
MODULE_AUTHOR("Ralf Baechle <ralf@linux-mips.org>");
MODULE_LICENSE("GPL");