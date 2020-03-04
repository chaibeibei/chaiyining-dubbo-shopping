package com.chaiyining.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaiyining.dao.BrandDao;
import com.chaiyining.pojo.Brand;
import com.chaiyining.service.BrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass=BrandService.class)
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandDao brandDao;

	@Override
	public PageInfo<Brand> list(String name, int pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<Brand> list=brandDao.list(name);
		
		return new PageInfo<>(list);
	}
	
	
}
