package com.yf.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yf.ssm.po.Items;
import com.yf.ssm.po.ItemsCustom;
import com.yf.ssm.service.ItemsService;

/**
* File: ItemsController.java
* Description: 商品的controller
* @author wuyifeng
* @date 2016年10月16日下午7:29:22
* @version 1.0
**/

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
    //商品查询
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{
    	
    	List<ItemsCustom> itemsList = itemsService.findItemsList(null);
    	
		//数据
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		
		//视图
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
    	
    }
	
}
