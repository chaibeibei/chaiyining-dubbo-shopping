package com.chaiyining.dao;

import java.util.List;

import com.chaiyining.pojo.Brand;

public interface BrandDao {

	List<Brand> list(String name);

}
