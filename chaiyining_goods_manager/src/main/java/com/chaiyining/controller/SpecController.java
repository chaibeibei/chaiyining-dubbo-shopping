package com.chaiyining.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chaiyining.pojo.Spec;
import com.chaiyining.service.SpecService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("spec")
public class SpecController {

	@Reference
	private SpecService specService;
	
	//列表查询
	@RequestMapping("list")
	public String list(Model m,HttpServletRequest request,@RequestParam(defaultValue="1") int pageNum, String name) {
		PageInfo<Spec> pageInfo = specService.list(name, pageNum);
		m.addAttribute("pageInfo",pageInfo);
		m.addAttribute("name",name);
		return "spec/list";
	}
	
	//添加
	@RequestMapping("add")
	@ResponseBody
	public int add(HttpServletRequest request,Spec spec 
	) {
		System.out.println("spec+++++++++++++++++++++++" + spec);
		//System.out.println();
		spec.getOptions().removeIf(x->{return x.getOption_name()==null;});
		//System.out.println("spec 处理后：" + spec);
		//调用服务
		int add = specService.add(spec);
		return add;
	}

}
