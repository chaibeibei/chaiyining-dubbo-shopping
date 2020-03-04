package com.chaiyining.dao;

import java.util.List;

import com.chaiyining.pojo.Spec;
import com.chaiyining.pojo.Spec_Option;
;

public interface SpecDao {

	//列表展示
		List<Spec> list(String name);
		
		
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


		//添加规格属性
		int addOption(Spec_Option spec_Option);
}
