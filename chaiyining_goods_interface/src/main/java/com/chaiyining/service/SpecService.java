package com.chaiyining.service;

import com.chaiyining.pojo.Spec;
import com.github.pagehelper.PageInfo;

public interface SpecService {

	//列表展示
	PageInfo<Spec> list(String name,int page);
	
	
	//添加
	int add(Spec spec);
	
	
	//修改
	int update(Spec spec);
	
	
	//删除
	int delete(int id);
	
	
	//回显
	Spec findById(int id);
	
	
	//批删
	int deleteBatch(int[] id);
}
