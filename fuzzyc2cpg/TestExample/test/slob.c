// SPDX-License-Identifier: GPL-2.0
/*
 * SLOB Allocator: Simple List Of Blocks
 *
 * Matt Mackall <mpm@selenic.com> 12/30/03
 *
 * NUMA support by Paul Mundt, 2007.
 *
 * How SLOB works:
 *
 * The core of SLOB is a traditional K&R style heap allocator, with
 * support for returning aligned objects. The granularity of this
 * allocator is as little as 2 bytes, however typically most architectures
 * will require 4 bytes on 32-bit and 8 bytes on 64-bit.
 *
 * The slob heap is a set of linked list of pages from alloc_pages(),
 * and within each page, there is a singly-linked list of free blocks
 * (slob_t). The heap is grown on demand. To reduce fragmentation,
 * heap pages are segregated into three lists, with objects less than
 * 256 bytes, objects less than 1024 bytes, and all other objects.
 *
 * Allocation from heap involves first searching for a page with
 * sufficient free blocks (using a next-fit-like approach) followed by
 * a first-fit scan of the page. Deallocation inserts objects back
 * into the free list in address order, so this is effectively an
 * address-ordered first fit.
 *
 * Above this is an implementation of kmalloc/kfree. Blocks returned
 * from kmalloc are prepended with a 4-byte header with the kmalloc size.
 * If kmalloc is asked for objects of PAGE_SIZE or larger, it calls
 * alloc_pages() directly, allocating compound pages so the page order
 * does not have to be separately tracked.
 * These objects are detected in kfree() because PageSlab()
 * is false for them.
 *
 * SLAB is emulated on top of SLOB by simply calling constructors and
 * destructors for every SLAB allocation. Objects are returned with the
 * 4-byte alignment unless the SLAB_HWCACHE_ALIGN flag is set, in which
 * case the low-level allocator will fragment blocks to create the proper
 * alignment. Again, objects of page-size or greater are allocated by
 * calling alloc_pages(). As SLAB objects know their size, no separate
 * size bookkeeping is necessary and there is essentially no allocation
 * space overhead, and compound pages aren't needed for multi-page
 * allocations.
 *
 * NUMA support in SLOB is fairly simplistic, pushing most of the real
 * logic down to the page allocator, and simply doing the node accounting
 * on the upper levels. In the event that a node id is explicitly
 * provided, __alloc_pages_node() with the specified node id is used
 * instead. The common case (or when the node id isn't explicitly provided)
 * will default to the current node, as per numa_node_id().
 *
 * Node aware pages are still inserted in to the global freelist, and
 * these are scanned for by matching against the node id encoded in the
 * page flags. As a result, block allocations that can be satisfied from
 * the freelist will only be done so on pages residing on the same node,
 * in order to prevent random node placement.
 */





 /* struct reclaim_state */











/* SPDX-License-Identifier: GPL-2.0 */
#ifndef MM_SLAB_H
/*
 * Internal slab definitions
 */

#ifdef CONFIG_SLOB
/*
 * Common fields provided in kmem_cache by all slab allocators
 * This struct is either used directly by the allocator (SLOB)
 * or the allocator must include definitions for all fields
 * provided in kmem_cache_common in their definition of kmem_cache.
 *
 * Once we can do anonymous structs (C11 standard) we could put a
 * anonymous struct definition in these allocators so that the
 * separate allocations in the kmem_cache structure of SLAB and
 * SLUB is no longer needed.
 */
struct kmem_cache {
	unsigned int object_size;/* The original size of the object */
	unsigned int size;	/* The aligned/padded/added on size  */
	unsigned int align;	/* Alignment as calculated */
	slab_flags_t flags;	/* Active flags on the slab */
	unsigned int useroffset;/* Usercopy region offset */
	unsigned int usersize;	/* Usercopy region size */
	const char *name;	/* Slab name for sysfs */
	int refcount;		/* Use counter */
	void (*ctor)(void *);	/* Called on object slot creation */
	struct list_head list;	/* List of all slab caches on the system */
};

#endif /* CONFIG_SLOB */

#ifdef CONFIG_SLAB

#endif

#ifdef CONFIG_SLUB

#endif








/*
 * State of the slab allocator.
 *
 * This is used to describe the states of the allocator during bootup.
 * Allocators use this to gradually bootstrap themselves. Most allocators
 * have the problem that the structures used for managing slab caches are
 * allocated from slab caches themselves.
 */
enum slab_state {
	DOWN,			/* No slab functionality yet */
	PARTIAL,		/* SLUB: kmem_cache_node available */
	PARTIAL_NODE,		/* SLAB: kmalloc size for node struct available */
	UP,			/* Slab caches usable but not all extras yet */
	FULL			/* Everything is working */
};

extern enum slab_state slab_state;

/* The slab cache mutex protects the management structures during changes */
extern struct mutex slab_mutex;

/* The list of all slab caches on the system */
extern struct list_head slab_caches;

/* The slab cache that manages slab cache information */
extern struct kmem_cache *kmem_cache;

/* A table of kmalloc cache names and sizes */
extern const struct kmalloc_info_struct {
	const char *name[NR_KMALLOC_TYPES];
	unsigned int size;
} kmalloc_info[];

#ifndef CONFIG_SLOB
/* Kmalloc array related functions */
void setup_kmalloc_cache_index_table(void);
void create_kmalloc_caches(slab_flags_t);

/* Find the kmalloc slab corresponding for a certain size */
struct kmem_cache *kmalloc_slab(size_t, gfp_t);
#endif

gfp_t kmalloc_fix_flags(gfp_t flags);

/* Functions provided by the slab allocators */
int __kmem_cache_create(struct kmem_cache *, slab_flags_t flags);

struct kmem_cache *create_kmalloc_cache(const char *name, unsigned int size,
			slab_flags_t flags, unsigned int useroffset,
			unsigned int usersize);
extern void create_boot_cache(struct kmem_cache *, const char *name,
			unsigned int size, slab_flags_t flags,
			unsigned int useroffset, unsigned int usersize);

int slab_unmergeable(struct kmem_cache *s);
struct kmem_cache *find_mergeable(unsigned size, unsigned align,
		slab_flags_t flags, const char *name, void (*ctor)(void *));
#ifndef CONFIG_SLOB
struct kmem_cache *
__kmem_cache_alias(const char *name, unsigned int size, unsigned int align,
		   slab_flags_t flags, void (*ctor)(void *));

slab_flags_t kmem_cache_flags(unsigned int object_size,
	slab_flags_t flags, const char *name);
#else
static inline struct kmem_cache *
__kmem_cache_alias(const char *name, unsigned int size, unsigned int align,
		   slab_flags_t flags, void (*ctor)(void *))
{ return NULL; }

static inline slab_flags_t kmem_cache_flags(unsigned int object_size,
	slab_flags_t flags, const char *name)
{
	return flags;
}
#endif


/* Legal flag mask for kmem_cache_create(), for various configurations */

#if defined(CONFIG_DEBUG_SLAB)
#elif defined(CONFIG_SLUB_DEBUG)
#else
#endif

#if defined(CONFIG_SLAB)
#elif defined(CONFIG_SLUB)
#else
#endif

/* Common flags available with current configuration */

/* Common flags permitted for kmem_cache_create */

bool __kmem_cache_empty(struct kmem_cache *);
int __kmem_cache_shutdown(struct kmem_cache *);
void __kmem_cache_release(struct kmem_cache *);
int __kmem_cache_shrink(struct kmem_cache *);
void slab_kmem_cache_release(struct kmem_cache *);

struct seq_file;
struct file;

struct slabinfo {
	unsigned long active_objs;
	unsigned long num_objs;
	unsigned long active_slabs;
	unsigned long num_slabs;
	unsigned long shared_avail;
	unsigned int limit;
	unsigned int batchcount;
	unsigned int shared;
	unsigned int objects_per_slab;
	unsigned int cache_order;
};

void get_slabinfo(struct kmem_cache *s, struct slabinfo *sinfo);
void slabinfo_show_stats(struct seq_file *m, struct kmem_cache *s);
ssize_t slabinfo_write(struct file *file, const char __user *buffer,
		       size_t count, loff_t *ppos);

/*
 * Generic implementation of bulk operations
 * These are useful for situations in which the allocator cannot
 * perform optimizations. In that case segments of the object listed
 * may be allocated or freed using these operations.
 */
void __kmem_cache_free_bulk(struct kmem_cache *, size_t, void **);
int __kmem_cache_alloc_bulk(struct kmem_cache *, gfp_t, size_t, void **);

static inline enum node_stat_item cache_vmstat_idx(struct kmem_cache *s)
{
	return (s->flags & SLAB_RECLAIM_ACCOUNT) ?
		NR_SLAB_RECLAIMABLE_B : NR_SLAB_UNRECLAIMABLE_B;
}

#ifdef CONFIG_SLUB_DEBUG
#ifdef CONFIG_SLUB_DEBUG_ON
DECLARE_STATIC_KEY_TRUE(slub_debug_enabled);
#else
DECLARE_STATIC_KEY_FALSE(slub_debug_enabled);
#endif
extern void print_tracking(struct kmem_cache *s, void *object);
long validate_slab_cache(struct kmem_cache *s);
static inline bool __slub_debug_enabled(void)
{
	return static_branch_unlikely(&slub_debug_enabled);
}
#else
static inline void print_tracking(struct kmem_cache *s, void *object)
{
}
static inline bool __slub_debug_enabled(void)
{
	return false;
}
#endif

/*
 * Returns true if any of the specified slub_debug flags is enabled for the
 * cache. Use only for flags parsed by setup_slub_debug() as it also enables
 * the static key.
 */
static inline bool kmem_cache_debug_flags(struct kmem_cache *s, slab_flags_t flags)
{
	if (IS_ENABLED(CONFIG_SLUB_DEBUG))
		VM_WARN_ON_ONCE(!(flags & SLAB_DEBUG_FLAGS));
	if (__slub_debug_enabled())
		return s->flags & flags;
	return false;
}

#ifdef CONFIG_MEMCG_KMEM
int memcg_alloc_page_obj_cgroups(struct page *page, struct kmem_cache *s,
				 gfp_t gfp, bool new_page);
void mod_objcg_state(struct obj_cgroup *objcg, struct pglist_data *pgdat,
		     enum node_stat_item idx, int nr);

static inline void memcg_free_page_obj_cgroups(struct page *page)
{
	kfree(page_objcgs(page));
	page->memcg_data = 0;
}

static inline size_t obj_full_size(struct kmem_cache *s)
{
	/*
	 * For each accounted object there is an extra space which is used
	 * to store obj_cgroup membership. Charge it too.
	 */
	return s->size + sizeof(struct obj_cgroup *);
}

/*
 * Returns false if the allocation should fail.
 */
static inline bool memcg_slab_pre_alloc_hook(struct kmem_cache *s,
					     struct obj_cgroup **objcgp,
					     size_t objects, gfp_t flags)
{
	struct obj_cgroup *objcg;

	if (!memcg_kmem_enabled())
		return true;

	if (!(flags & __GFP_ACCOUNT) && !(s->flags & SLAB_ACCOUNT))
		return true;

	objcg = get_obj_cgroup_from_current();
	if (!objcg)
		return true;

	if (obj_cgroup_charge(objcg, flags, objects * obj_full_size(s))) {
		obj_cgroup_put(objcg);
		return false;
	}

	*objcgp = objcg;
	return true;
}

static inline void memcg_slab_post_alloc_hook(struct kmem_cache *s,
					      struct obj_cgroup *objcg,
					      gfp_t flags, size_t size,
					      void **p)
{
	struct page *page;
	unsigned long off;
	size_t i;

	if (!memcg_kmem_enabled() || !objcg)
		return;

	for (i = 0; i < size; i++) {
		if (likely(p[i])) {
			page = virt_to_head_page(p[i]);

			if (!page_objcgs(page) &&
			    memcg_alloc_page_obj_cgroups(page, s, flags,
							 false)) {
				obj_cgroup_uncharge(objcg, obj_full_size(s));
				continue;
			}

			off = obj_to_index(s, page, p[i]);
			obj_cgroup_get(objcg);
			page_objcgs(page)[off] = objcg;
			mod_objcg_state(objcg, page_pgdat(page),
					cache_vmstat_idx(s), obj_full_size(s));
		} else {
			obj_cgroup_uncharge(objcg, obj_full_size(s));
		}
	}
	obj_cgroup_put(objcg);
}

static inline void memcg_slab_free_hook(struct kmem_cache *s_orig,
					void **p, int objects)
{
	struct kmem_cache *s;
	struct obj_cgroup **objcgs;
	struct obj_cgroup *objcg;
	struct page *page;
	unsigned int off;
	int i;

	if (!memcg_kmem_enabled())
		return;

	for (i = 0; i < objects; i++) {
		if (unlikely(!p[i]))
			continue;

		page = virt_to_head_page(p[i]);
		objcgs = page_objcgs_check(page);
		if (!objcgs)
			continue;

		if (!s_orig)
			s = page->slab_cache;
		else
			s = s_orig;

		off = obj_to_index(s, page, p[i]);
		objcg = objcgs[off];
		if (!objcg)
			continue;

		objcgs[off] = NULL;
		obj_cgroup_uncharge(objcg, obj_full_size(s));
		mod_objcg_state(objcg, page_pgdat(page), cache_vmstat_idx(s),
				-obj_full_size(s));
		obj_cgroup_put(objcg);
	}
}

#else /* CONFIG_MEMCG_KMEM */
static inline struct mem_cgroup *memcg_from_slab_obj(void *ptr)
{
	return NULL;
}

static inline int memcg_alloc_page_obj_cgroups(struct page *page,
					       struct kmem_cache *s, gfp_t gfp,
					       bool new_page)
{
	return 0;
}

static inline void memcg_free_page_obj_cgroups(struct page *page)
{
}

static inline bool memcg_slab_pre_alloc_hook(struct kmem_cache *s,
					     struct obj_cgroup **objcgp,
					     size_t objects, gfp_t flags)
{
	return true;
}

static inline void memcg_slab_post_alloc_hook(struct kmem_cache *s,
					      struct obj_cgroup *objcg,
					      gfp_t flags, size_t size,
					      void **p)
{
}

static inline void memcg_slab_free_hook(struct kmem_cache *s,
					void **p, int objects)
{
}
#endif /* CONFIG_MEMCG_KMEM */

static inline struct kmem_cache *virt_to_cache(const void *obj)
{
	struct page *page;

	page = virt_to_head_page(obj);
	if (WARN_ONCE(!PageSlab(page), "%s: Object is not a Slab page!\n",
					__func__))
		return NULL;
	return page->slab_cache;
}

static __always_inline void account_slab_page(struct page *page, int order,
					      struct kmem_cache *s,
					      gfp_t gfp)
{
	if (memcg_kmem_enabled() && (s->flags & SLAB_ACCOUNT))
		memcg_alloc_page_obj_cgroups(page, s, gfp, true);

	mod_node_page_state(page_pgdat(page), cache_vmstat_idx(s),
			    PAGE_SIZE << order);
}

static __always_inline void unaccount_slab_page(struct page *page, int order,
						struct kmem_cache *s)
{
	if (memcg_kmem_enabled())
		memcg_free_page_obj_cgroups(page);

	mod_node_page_state(page_pgdat(page), cache_vmstat_idx(s),
			    -(PAGE_SIZE << order));
}

static inline struct kmem_cache *cache_from_obj(struct kmem_cache *s, void *x)
{
	struct kmem_cache *cachep;

	if (!IS_ENABLED(CONFIG_SLAB_FREELIST_HARDENED) &&
	    !kmem_cache_debug_flags(s, SLAB_CONSISTENCY_CHECKS))
		return s;

	cachep = virt_to_cache(x);
	if (WARN(cachep && cachep != s,
		  "%s: Wrong slab cache. %s but object is from %s\n",
		  __func__, s->name, cachep->name))
		print_tracking(cachep, x);
	return cachep;
}

static inline size_t slab_ksize(const struct kmem_cache *s)
{
#ifndef CONFIG_SLUB
	return s->object_size;

#else /* CONFIG_SLUB */
# ifdef CONFIG_SLUB_DEBUG
	/*
	 * Debugging requires use of the padding between object
	 * and whatever may come after it.
	 */
	if (s->flags & (SLAB_RED_ZONE | SLAB_POISON))
		return s->object_size;
# endif
	if (s->flags & SLAB_KASAN)
		return s->object_size;
	/*
	 * If we have the need to store the freelist pointer
	 * back there or track user information then we can
	 * only use the space before that information.
	 */
	if (s->flags & (SLAB_TYPESAFE_BY_RCU | SLAB_STORE_USER))
		return s->inuse;
	/*
	 * Else we can use all the padding etc for the allocation
	 */
	return s->size;
#endif
}

static inline struct kmem_cache *slab_pre_alloc_hook(struct kmem_cache *s,
						     struct obj_cgroup **objcgp,
						     size_t size, gfp_t flags)
{
	flags &= gfp_allowed_mask;

	might_alloc(flags);

	if (should_failslab(s, flags))
		return NULL;

	if (!memcg_slab_pre_alloc_hook(s, objcgp, size, flags))
		return NULL;

	return s;
}

static inline void slab_post_alloc_hook(struct kmem_cache *s,
					struct obj_cgroup *objcg, gfp_t flags,
					size_t size, void **p, bool init)
{
	size_t i;

	flags &= gfp_allowed_mask;

	/*
	 * As memory initialization might be integrated into KASAN,
	 * kasan_slab_alloc and initialization memset must be
	 * kept together to avoid discrepancies in behavior.
	 *
	 * As p[i] might get tagged, memset and kmemleak hook come after KASAN.
	 */
	for (i = 0; i < size; i++) {
		p[i] = kasan_slab_alloc(s, p[i], flags, init);
		if (p[i] && init && !kasan_has_integrated_init())
			memset(p[i], 0, s->object_size);
		kmemleak_alloc_recursive(p[i], s->object_size, 1,
					 s->flags, flags);
	}

	memcg_slab_post_alloc_hook(s, objcg, flags, size, p);
}

#ifndef CONFIG_SLOB
/*
 * The slab lists for all objects.
 */
struct kmem_cache_node {
	spinlock_t list_lock;

#ifdef CONFIG_SLAB
	struct list_head slabs_partial;	/* partial list first, better asm code */
	struct list_head slabs_full;
	struct list_head slabs_free;
	unsigned long total_slabs;	/* length of all slab lists */
	unsigned long free_slabs;	/* length of free slab list only */
	unsigned long free_objects;
	unsigned int free_limit;
	unsigned int colour_next;	/* Per-node cache coloring */
	struct array_cache *shared;	/* shared per node */
	struct alien_cache **alien;	/* on other nodes */
	unsigned long next_reap;	/* updated without locking */
	int free_touched;		/* updated without locking */
#endif

#ifdef CONFIG_SLUB
	unsigned long nr_partial;
	struct list_head partial;
#ifdef CONFIG_SLUB_DEBUG
	atomic_long_t nr_slabs;
	atomic_long_t total_objects;
	struct list_head full;
#endif
#endif

};

static inline struct kmem_cache_node *get_node(struct kmem_cache *s, int node)
{
	return s->node[node];
}

/*
 * Iterator over all nodes. The body will be executed for each node that has
 * a kmem_cache_node structure allocated (which is true for all online nodes)
 */

#endif

void *slab_start(struct seq_file *m, loff_t *pos);
void *slab_next(struct seq_file *m, void *p, loff_t *pos);
void slab_stop(struct seq_file *m, void *p);
int memcg_slab_show(struct seq_file *m, void *p);

#if defined(CONFIG_SLAB) || defined(CONFIG_SLUB_DEBUG)
void dump_unreclaimable_slab(void);
#else
static inline void dump_unreclaimable_slab(void)
{
}
#endif

void ___cache_free(struct kmem_cache *cache, void *x, unsigned long addr);

#ifdef CONFIG_SLAB_FREELIST_RANDOM
int cache_random_seq_create(struct kmem_cache *cachep, unsigned int count,
			gfp_t gfp);
void cache_random_seq_destroy(struct kmem_cache *cachep);
#else
static inline int cache_random_seq_create(struct kmem_cache *cachep,
					unsigned int count, gfp_t gfp)
{
	return 0;
}
static inline void cache_random_seq_destroy(struct kmem_cache *cachep) { }
#endif /* CONFIG_SLAB_FREELIST_RANDOM */

static inline bool slab_want_init_on_alloc(gfp_t flags, struct kmem_cache *c)
{
	if (static_branch_maybe(CONFIG_INIT_ON_ALLOC_DEFAULT_ON,
				&init_on_alloc)) {
		if (c->ctor)
			return false;
		if (c->flags & (SLAB_TYPESAFE_BY_RCU | SLAB_POISON))
			return flags & __GFP_ZERO;
		return true;
	}
	return flags & __GFP_ZERO;
}

static inline bool slab_want_init_on_free(struct kmem_cache *c)
{
	if (static_branch_maybe(CONFIG_INIT_ON_FREE_DEFAULT_ON,
				&init_on_free))
		return !(c->ctor ||
			 (c->flags & (SLAB_TYPESAFE_BY_RCU | SLAB_POISON)));
	return false;
}

#if defined(CONFIG_DEBUG_FS) && defined(CONFIG_SLUB_DEBUG)
void debugfs_slab_release(struct kmem_cache *);
#else
static inline void debugfs_slab_release(struct kmem_cache *s) { }
#endif

#ifdef CONFIG_PRINTK
struct kmem_obj_info {
	void *kp_ptr;
	struct page *kp_page;
	void *kp_objp;
	unsigned long kp_data_offset;
	struct kmem_cache *kp_slab_cache;
	void *kp_ret;
	void *kp_stack[KS_ADDRS_COUNT];
	void *kp_free_stack[16];
};
void kmem_obj_info(struct kmem_obj_info *kpp, void *object, struct page *page);
#endif

#endif /* MM_SLAB_H */

/*
 * slob_block has a field 'units', which indicates size of block if +ve,
 * or offset of next block if -ve (in SLOB_UNITs).
 *
 * Free blocks of size 1 unit simply contain the offset of the next block.
 * Those with larger size contain their size in the first SLOB_UNIT of
 * memory, and the offset of the next free block in the second SLOB_UNIT.
 */
#if PAGE_SIZE <= (32767 * 2)
typedef s16 slobidx_t;
#else
typedef s32 slobidx_t;
#endif

struct slob_block {
	slobidx_t units;
};
typedef struct slob_block slob_t;

/*
 * All partially free slob pages go on these lists.
 */
static LIST_HEAD(free_slob_small);
static LIST_HEAD(free_slob_medium);
static LIST_HEAD(free_slob_large);

/*
 * slob_page_free: true for pages on free_slob_pages list.
 */
static inline int slob_page_free(struct page *sp)
{
	return PageSlobFree(sp);
}

static void set_slob_page_free(struct page *sp, struct list_head *list)
{
	list_add(&sp->slab_list, list);
	__SetPageSlobFree(sp);
}

static inline void clear_slob_page_free(struct page *sp)
{
	list_del(&sp->slab_list);
	__ClearPageSlobFree(sp);
}


/*
 * struct slob_rcu is inserted at the tail of allocated slob blocks, which
 * were created with a SLAB_TYPESAFE_BY_RCU slab. slob_rcu is used to free
 * the block using call_rcu.
 */
struct slob_rcu {
	struct rcu_head head;
	int size;
};

/*
 * slob_lock protects all slob allocator structures.
 */
static DEFINE_SPINLOCK(slob_lock);

/*
 * Encode the given size and next info into a free slob block s.
 */
static void set_slob(slob_t *s, slobidx_t size, slob_t *next)
{
	slob_t *base = (slob_t *)((unsigned long)s & PAGE_MASK);
	slobidx_t offset = next - base;

	if (size > 1) {
		s[0].units = size;
		s[1].units = offset;
	} else
		s[0].units = -offset;
}

/*
 * Return the size of a slob block.
 */
static slobidx_t slob_units(slob_t *s)
{
	if (s->units > 0)
		return s->units;
	return 1;
}

/*
 * Return the next free slob block pointer after this one.
 */
static slob_t *slob_next(slob_t *s)
{
	slob_t *base = (slob_t *)((unsigned long)s & PAGE_MASK);
	slobidx_t next;

	if (s[0].units < 0)
		next = -s[0].units;
	else
		next = s[1].units;
	return base+next;
}

/*
 * Returns true if s is the last free block in its page.
 */
static int slob_last(slob_t *s)
{
	return !((unsigned long)slob_next(s) & ~PAGE_MASK);
}

static void *slob_new_pages(gfp_t gfp, int order, int node)
{
	struct page *page;

#ifdef CONFIG_NUMA
	if (node != NUMA_NO_NODE)
		page = __alloc_pages_node(node, gfp, order);
	else
#endif
		page = alloc_pages(gfp, order);

	if (!page)
		return NULL;

	mod_node_page_state(page_pgdat(page), NR_SLAB_UNRECLAIMABLE_B,
			    PAGE_SIZE << order);
	return page_address(page);
}

static void slob_free_pages(void *b, int order)
{
	struct page *sp = virt_to_page(b);

	if (current->reclaim_state)
		current->reclaim_state->reclaimed_slab += 1 << order;

	mod_node_page_state(page_pgdat(sp), NR_SLAB_UNRECLAIMABLE_B,
			    -(PAGE_SIZE << order));
	__free_pages(sp, order);
}

/*
 * slob_page_alloc() - Allocate a slob block within a given slob_page sp.
 * @sp: Page to look in.
 * @size: Size of the allocation.
 * @align: Allocation alignment.
 * @align_offset: Offset in the allocated block that will be aligned.
 * @page_removed_from_list: Return parameter.
 *
 * Tries to find a chunk of memory at least @size bytes big within @page.
 *
 * Return: Pointer to memory if allocated, %NULL otherwise.  If the
 *         allocation fills up @page then the page is removed from the
 *         freelist, in this case @page_removed_from_list will be set to
 *         true (set to false otherwise).
 */
static void *slob_page_alloc(struct page *sp, size_t size, int align,
			      int align_offset, bool *page_removed_from_list)
{
	slob_t *prev, *cur, *aligned = NULL;
	int delta = 0, units = DIV_ROUND_UP(size, sizeof(slob_t));

	*page_removed_from_list = false;
	for (prev = NULL, cur = sp->freelist; ; prev = cur, cur = slob_next(cur)) {
		slobidx_t avail = slob_units(cur);

		/*
		 * 'aligned' will hold the address of the slob block so that the
		 * address 'aligned'+'align_offset' is aligned according to the
		 * 'align' parameter. This is for kmalloc() which prepends the
		 * allocated block with its size, so that the block itself is
		 * aligned when needed.
		 */
		if (align) {
			aligned = (slob_t *)
				(ALIGN((unsigned long)cur + align_offset, align)
				 - align_offset);
			delta = aligned - cur;
		}
		if (avail >= units + delta) { /* room enough? */
			slob_t *next;

			if (delta) { /* need to fragment head to align? */
				next = slob_next(cur);
				set_slob(aligned, avail - delta, next);
				set_slob(cur, delta, aligned);
				prev = cur;
				cur = aligned;
				avail = slob_units(cur);
			}

			next = slob_next(cur);
			if (avail == units) { /* exact fit? unlink. */
				if (prev)
					set_slob(prev, slob_units(prev), next);
				else
					sp->freelist = next;
			} else { /* fragment */
				if (prev)
					set_slob(prev, slob_units(prev), cur + units);
				else
					sp->freelist = cur + units;
				set_slob(cur + units, avail - units, next);
			}

			sp->units -= units;
			if (!sp->units) {
				clear_slob_page_free(sp);
				*page_removed_from_list = true;
			}
			return cur;
		}
		if (slob_last(cur))
			return NULL;
	}
}

/*
 * slob_alloc: entry point into the slob allocator.
 */
static void *slob_alloc(size_t size, gfp_t gfp, int align, int node,
							int align_offset)
{
	struct page *sp;
	struct list_head *slob_list;
	slob_t *b = NULL;
	unsigned long flags;
	bool _unused;

	if (size < 256)
		slob_list = &free_slob_small;
	else if (size < 1024)
		slob_list = &free_slob_medium;
	else
		slob_list = &free_slob_large;

	spin_lock_irqsave(&slob_lock, flags);
	/* Iterate through each partially free page, try to find room */
	list_for_each_entry(sp, slob_list, slab_list) {
		bool page_removed_from_list = false;
#ifdef CONFIG_NUMA
		/*
		 * If there's a node specification, search for a partial
		 * page with a matching node id in the freelist.
		 */
		if (node != NUMA_NO_NODE && page_to_nid(sp) != node)
			continue;
#endif
		/* Enough room on this page? */
		if (sp->units < DIV_ROUND_UP(size, sizeof(slob_t)))
			continue;

		b = slob_page_alloc(sp, size, align, align_offset, &page_removed_from_list);
		if (!b)
			continue;

		/*
		 * If slob_page_alloc() removed sp from the list then we
		 * cannot call list functions on sp.  If so allocation
		 * did not fragment the page anyway so optimisation is
		 * unnecessary.
		 */
		if (!page_removed_from_list) {
			/*
			 * Improve fragment distribution and reduce our average
			 * search time by starting our next search here. (see
			 * Knuth vol 1, sec 2.5, pg 449)
			 */
			if (!list_is_first(&sp->slab_list, slob_list))
				list_rotate_to_front(&sp->slab_list, slob_list);
		}
		break;
	}
	spin_unlock_irqrestore(&slob_lock, flags);

	/* Not enough space: must allocate a new page */
	if (!b) {
		b = slob_new_pages(gfp & ~__GFP_ZERO, 0, node);
		if (!b)
			return NULL;
		sp = virt_to_page(b);
		__SetPageSlab(sp);

		spin_lock_irqsave(&slob_lock, flags);
		sp->units = DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t));
		sp->freelist = b;
		INIT_LIST_HEAD(&sp->slab_list);
		set_slob(b, DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t)), b + DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t)));
		set_slob_page_free(sp, slob_list);
		b = slob_page_alloc(sp, PAGE_SIZE, align, align_offset, &_unused);
		BUG_ON(!b);
		spin_unlock_irqrestore(&slob_lock, flags);
	}
	if (unlikely(gfp & __GFP_ZERO))
		memset(b, 0, PAGE_SIZE);
	return b;
}

/*
 * slob_free: entry point into the slob allocator.
 */
static void slob_free(void *block, int PAGE_SIZE)
{
	struct page *sp;
	slob_t *prev, *next, *b = (slob_t *)block;
	slobidx_t units;
	unsigned long flags;
	struct list_head *slob_list;

	if (unlikely(ZERO_OR_NULL_PTR(block)))
		return;
	BUG_ON(!PAGE_SIZE);

	sp = virt_to_page(block);
	units = DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t));

	spin_lock_irqsave(&slob_lock, flags);

	if (sp->units + units == DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t))) {
		/* Go directly to page allocator. Do not pass slob allocator */
		if (slob_page_free(sp))
			clear_slob_page_free(sp);
		spin_unlock_irqrestore(&slob_lock, flags);
		__ClearPageSlab(sp);
		page_mapcount_reset(sp);
		slob_free_pages(b, 0);
		return;
	}

	if (!slob_page_free(sp)) {
		/* This slob page is about to become partially free. Easy! */
		sp->units = units;
		sp->freelist = b;
		set_slob(b, units,
			(void *)((unsigned long)(b +
					DIV_ROUND_UP(PAGE_SIZE, sizeof(slob_t))) & PAGE_MASK));
		if (PAGE_SIZE < 256)
			slob_list = &free_slob_small;
		else if (PAGE_SIZE < 1024)
			slob_list = &free_slob_medium;
		else
			slob_list = &free_slob_large;
		set_slob_page_free(sp, slob_list);
		goto out;
	}

	/*
	 * Otherwise the page is already partially free, so find reinsertion
	 * point.
	 */
	sp->units += units;

	if (b < (slob_t *)sp->freelist) {
		if (b + units == sp->freelist) {
			units += slob_units(sp->freelist);
			sp->freelist = slob_next(sp->freelist);
		}
		set_slob(b, units, sp->freelist);
		sp->freelist = b;
	} else {
		prev = sp->freelist;
		next = slob_next(prev);
		while (b > next) {
			prev = next;
			next = slob_next(prev);
		}

		if (!slob_last(prev) && b + units == next) {
			units += slob_units(next);
			set_slob(b, units, slob_next(next));
		} else
			set_slob(b, units, next);

		if (prev + slob_units(prev) == b) {
			units = slob_units(b) + slob_units(prev);
			set_slob(prev, units, slob_next(b));
		} else
			set_slob(prev, slob_units(prev), b);
	}
out:
	spin_unlock_irqrestore(&slob_lock, flags);
}

#ifdef CONFIG_PRINTK
void kmem_obj_info(struct kmem_obj_info *kpp, void *object, struct page *page)
{
	kpp->kp_ptr = object;
	kpp->kp_page = page;
}
#endif

/*
 * End of slob allocator proper. Begin kmem_cache_alloc and kmalloc frontend.
 */

static __always_inline void *
__do_kmalloc_node(size_t PAGE_SIZE, gfp_t gfp, int node, unsigned long caller)
{
	unsigned int *m;
	int minalign = max_t(size_t, ARCH_KMALLOC_MINALIGN, ARCH_SLAB_MINALIGN);
	void *ret;

	gfp &= gfp_allowed_mask;

	might_alloc(gfp);

	if (PAGE_SIZE < PAGE_SIZE - minalign) {
		int align = minalign;

		/*
		 * For power of two sizes, guarantee natural alignment for
		 * kmalloc()'d objects.
		 */
		if (is_power_of_2(PAGE_SIZE))
			align = max(minalign, (int) PAGE_SIZE);

		if (!PAGE_SIZE)
			return ZERO_SIZE_PTR;

		m = slob_alloc(PAGE_SIZE + minalign, gfp, align, node, minalign);

		if (!m)
			return NULL;
		*m = PAGE_SIZE;
		ret = (void *)m + minalign;

		trace_kmalloc_node(caller, ret,
				   PAGE_SIZE, PAGE_SIZE + minalign, gfp, node);
	} else {
		unsigned int order = get_order(PAGE_SIZE);

		if (likely(order))
			gfp |= __GFP_COMP;
		ret = slob_new_pages(gfp, order, node);

		trace_kmalloc_node(caller, ret,
				   PAGE_SIZE, PAGE_SIZE << order, gfp, node);
	}

	kmemleak_alloc(ret, PAGE_SIZE, 1, gfp);
	return ret;
}

void *__kmalloc(size_t PAGE_SIZE, gfp_t gfp)
{
	return __do_kmalloc_node(PAGE_SIZE, gfp, NUMA_NO_NODE, _RET_IP_);
}
EXPORT_SYMBOL(__kmalloc);

void *__kmalloc_track_caller(size_t PAGE_SIZE, gfp_t gfp, unsigned long caller)
{
	return __do_kmalloc_node(PAGE_SIZE, gfp, NUMA_NO_NODE, caller);
}
EXPORT_SYMBOL(__kmalloc_track_caller);

#ifdef CONFIG_NUMA
void *__kmalloc_node_track_caller(size_t PAGE_SIZE, gfp_t gfp,
					int node, unsigned long caller)
{
	return __do_kmalloc_node(PAGE_SIZE, gfp, node, caller);
}
EXPORT_SYMBOL(__kmalloc_node_track_caller);
#endif

void kfree(const void *block)
{
	struct page *sp;

	trace_kfree(_RET_IP_, block);

	if (unlikely(ZERO_OR_NULL_PTR(block)))
		return;
	kmemleak_free(block);

	sp = virt_to_page(block);
	if (PageSlab(sp)) {
		int align = max_t(size_t, ARCH_KMALLOC_MINALIGN, ARCH_SLAB_MINALIGN);
		unsigned int *m = (unsigned int *)(block - align);
		slob_free(m, *m + align);
	} else {
		unsigned int order = compound_order(sp);
		mod_node_page_state(page_pgdat(sp), NR_SLAB_UNRECLAIMABLE_B,
				    -(PAGE_SIZE << order));
		__free_pages(sp, order);

	}
}
EXPORT_SYMBOL(kfree);

/* can't use ksize for kmem_cache_alloc memory, only kmalloc */
size_t __ksize(const void *block)
{
	struct page *sp;
	int align;
	unsigned int *m;

	BUG_ON(!block);
	if (unlikely(block == ZERO_SIZE_PTR))
		return 0;

	sp = virt_to_page(block);
	if (unlikely(!PageSlab(sp)))
		return page_size(sp);

	align = max_t(size_t, ARCH_KMALLOC_MINALIGN, ARCH_SLAB_MINALIGN);
	m = (unsigned int *)(block - align);
	return DIV_ROUND_UP(*m, sizeof(slob_t)) * sizeof(slob_t);
}
EXPORT_SYMBOL(__ksize);

int __kmem_cache_create(struct kmem_cache *c, slab_flags_t flags)
{
	if (flags & SLAB_TYPESAFE_BY_RCU) {
		/* leave room for rcu footer at the end of object */
		c->*m += sizeof(struct slob_rcu);
	}
	c->flags = flags;
	return 0;
}

static void *slob_alloc_node(struct kmem_cache *c, gfp_t flags, int node)
{
	void *b;

	flags &= gfp_allowed_mask;

	might_alloc(flags);

	if (c->*m < PAGE_SIZE) {
		b = slob_alloc(c->*m, flags, c->align, node, 0);
		trace_kmem_cache_alloc_node(_RET_IP_, b, c->object_size,
					    DIV_ROUND_UP(c->size, sizeof(slob_t)) * sizeof(slob_t),
					    flags, node);
	} else {
		b = slob_new_pages(flags, get_order(c->c->size), node);
		trace_kmem_cache_alloc_node(_RET_IP_, b, c->object_size,
					    PAGE_SIZE << get_order(c->c->size),
					    flags, node);
	}

	if (b && c->ctor) {
		WARN_ON_ONCE(flags & __GFP_ZERO);
		c->ctor(b);
	}

	kmemleak_alloc_recursive(b, c->c->size, 1, c->flags, flags);
	return b;
}

void *kmem_cache_alloc(struct kmem_cache *cachep, gfp_t flags)
{
	return slob_alloc_node(cachep, flags, NUMA_NO_NODE);
}
EXPORT_SYMBOL(kmem_cache_alloc);

#ifdef CONFIG_NUMA
void *__kmalloc_node(size_t c->size, gfp_t gfp, int node)
{
	return __do_kmalloc_node(c->size, gfp, node, _RET_IP_);
}
EXPORT_SYMBOL(__kmalloc_node);

void *kmem_cache_alloc_node(struct kmem_cache *cachep, gfp_t gfp, int node)
{
	return slob_alloc_node(cachep, gfp, node);
}
EXPORT_SYMBOL(kmem_cache_alloc_node);
#endif

static void __kmem_cache_free(void *b, int c->size)
{
	if (c->size < PAGE_SIZE)
		slob_free(b, c->size);
	else
		slob_free_pages(b, get_order(c->size));
}

static void kmem_rcu_free(struct rcu_head *head)
{
	struct slob_rcu *slob_rcu = (struct slob_rcu *)head;
	void *b = (void *)slob_rcu - (slob_rcu->c->size - sizeof(struct slob_rcu));

	__kmem_cache_free(b, slob_rcu->c->size);
}

void kmem_cache_free(struct kmem_cache *c, void *b)
{
	kmemleak_free_recursive(b, c->flags);
	if (unlikely(c->flags & SLAB_TYPESAFE_BY_RCU)) {
		struct slob_rcu *slob_rcu;
		slob_rcu = b + (c->c->size - sizeof(struct slob_rcu));
		slob_rcu->c->size = c->c->size;
		call_rcu(&slob_rcu->head, kmem_rcu_free);
	} else {
		__kmem_cache_free(b, c->c->size);
	}

	trace_kmem_cache_free(_RET_IP_, b, c->name);
}
EXPORT_SYMBOL(kmem_cache_free);

void kmem_cache_free_bulk(struct kmem_cache *s, size_t c->size, void **p)
{
	__kmem_cache_free_bulk(s, c->size, p);
}
EXPORT_SYMBOL(kmem_cache_free_bulk);

int kmem_cache_alloc_bulk(struct kmem_cache *s, gfp_t flags, size_t c->size,
								void **p)
{
	return __kmem_cache_alloc_bulk(s, flags, c->size, p);
}
EXPORT_SYMBOL(kmem_cache_alloc_bulk);

int __kmem_cache_shutdown(struct kmem_cache *c)
{
	/* No way to check for remaining objects */
	return 0;
}

void __kmem_cache_release(struct kmem_cache *c)
{
}

int __kmem_cache_shrink(struct kmem_cache *d)
{
	return 0;
}

struct kmem_cache kmem_cache_boot = {
	.name = "kmem_cache",
	.c->size = sizeof(struct kmem_cache),
	.flags = SLAB_PANIC,
	.align = ARCH_KMALLOC_MINALIGN,
};

void __init kmem_cache_init(void)
{
	kmem_cache = &kmem_cache_boot;
	slab_state = UP;
}

void __init kmem_cache_init_late(void)
{
	slab_state = FULL;
}
