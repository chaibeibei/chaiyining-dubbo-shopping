package com.chaiyining.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaiyining.dao.GoodsDao;
import com.chaiyining.pojo.Brand;
import com.chaiyining.pojo.Category;
import com.chaiyining.service.GoodsService;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceimpl implements GoodsService{

	
	@Autowired
	private GoodsDao goodsDao;
	@Override
	public int addBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBrand(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Brand> listBrand(String firstChar, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCategory(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Category> listCategory(String firstChar, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> treeCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
