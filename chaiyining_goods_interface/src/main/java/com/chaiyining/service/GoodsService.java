package com.chaiyining.service;

import java.util.List;

import com.chaiyining.pojo.Brand;
import com.chaiyining.pojo.Category;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	
	/**
	 * 
	 * 品牌
	 * 
	 * 
	 * */
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	PageInfo<Brand> listBrand( String firstChar,int page); 


	/**
	 * 
	 * 分类
	 * 
	 * */
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	
	PageInfo<Category> listCategory( String firstChar,int page); 
	//以树的形式显示列表
	List<Category> treeCategory(); 
	
	

}
