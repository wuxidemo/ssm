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
* Description: ��Ʒ��controller
* @author wuyifeng
* @date 2016��10��16������7:29:22
* @version 1.0
**/

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
    //��Ʒ��ѯ
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{
    	
    	List<ItemsCustom> itemsList = itemsService.findItemsList(null);
    	
		//����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		
		//��ͼ
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
    	
    }
	
}
