package com.yf.ssm.service;

import java.util.List;

import com.yf.ssm.po.ItemsCustom;
import com.yf.ssm.po.ItemsQueryVo;

/**
* File: ItemService.java
* Description: ��Ʒ����service
* @author wuyifeng
* @date 2016��10��16������7:07:57
* @version 1.0
**/

public interface ItemsService {

	//��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
