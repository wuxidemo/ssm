package com.yf.ssm.service;

import java.util.List;

import com.yf.ssm.po.ItemsCustom;
import com.yf.ssm.po.ItemsQueryVo;

/**
* File: ItemService.java
* Description: 商品管理service
* @author wuyifeng
* @date 2016年10月16日下午7:07:57
* @version 1.0
**/

public interface ItemsService {

	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
