/* This function will load the request id and various sgls for ioctls */
static void twa_load_sgl(TW_Device_Extension *tw_dev, TW_Command_Full *full_command_packet, int request_id, dma_addr_t dma_handle, int length)
{
	TW_Command *oldcommand;
	TW_Command_Apache *newcommand;
	TW_SG_Entry *sgl;
	unsigned int pae = 0;

	if ((sizeof(long) < 8) && (sizeof(dma_addr_t) > 4))
		pae = 1;

	if (TW_OP_OUT(full_command_packet->command.newcommand.opcode__reserved) == TW_OP_EXECUTE_SCSI) {
		newcommand = &full_command_packet->command.newcommand;
		newcommand->request_id__lunl =
			TW_REQ_LUN_IN(TW_LUN_OUT(newcommand->request_id__lunl), request_id);
		if (length) {
			newcommand->sg_list[0].address = TW_CPU_TO_SGL(dma_handle + sizeof(TW_Ioctl_Buf_Apache));
			newcommand->sg_list[0].length = cpu_to_le32(length);
		}
		newcommand->sgl_entries__lunh =
			TW_REQ_LUN_IN(TW_LUN_OUT(newcommand->sgl_entries__lunh), length ? 1 : 0);
	} else {
		oldcommand = &full_command_packet->command.oldcommand;
		oldcommand->request_id = request_id;

		if (TW_SGL_OUT(oldcommand->opcode__sgloffset)) {
			/* Load the sg list */
			if (tw_dev->tw_pci_dev->device == PCI_DEVICE_ID_3WARE_9690SA)
				sgl = (TW_SG_Entry *)((u32 *)oldcommand+oldcommand->size - (sizeof(TW_SG_Entry)/4) + pae);
			else
				sgl = (TW_SG_Entry *)((u32 *)oldcommand+TW_SGL_OUT(oldcommand->opcode__sgloffset));
			sgl->address = TW_CPU_TO_SGL(dma_handle + sizeof(TW_Ioctl_Buf_Apache));
			sgl->length = cpu_to_le32(length);

			oldcommand->size += pae;
		}
	}
} /* End twa_load_sgl() */