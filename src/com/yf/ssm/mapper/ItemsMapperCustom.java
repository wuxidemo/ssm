package com.yf.ssm.mapper;

import java.util.List;

import com.yf.ssm.po.ItemsCustom;
import com.yf.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {
    //��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;


}