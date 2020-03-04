package com.chaiyining.service;

import com.chaiyining.pojo.Brand;
import com.github.pagehelper.PageInfo;

public interface BrandService {

	PageInfo<Brand> list(String name, int pageNum);

}
