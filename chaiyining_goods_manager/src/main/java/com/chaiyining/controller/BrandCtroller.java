package com.chaiyining.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chaiyining.pojo.Brand;
import com.chaiyining.service.BrandService;
import com.github.pagehelper.PageInfo;

/**
 * 品牌管理
 * @author zhuzg
 *
 */
@Controller
@RequestMapping("brand")
public class BrandCtroller {
	
	@Reference
	private BrandService brandService;
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int pageNum,Model m,String name) {
		
		PageInfo<Brand> pageInfo=brandService.list(name,pageNum);
		m.addAttribute("pageInfo",pageInfo);
		m.addAttribute("name",name);
		
		return "brand/list";
	}

}
