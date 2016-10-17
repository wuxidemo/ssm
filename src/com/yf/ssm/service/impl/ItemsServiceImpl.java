package com.yf.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yf.ssm.mapper.ItemsMapperCustom;
import com.yf.ssm.po.ItemsCustom;
import com.yf.ssm.po.ItemsQueryVo;
import com.yf.ssm.service.ItemsService;

/**
* File: ItemsServiceImpl.java
* Description: TODO
* @author wuyifeng
* @date 2016年10月16日下午7:10:22
* @version 1.0
**/

public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

}
