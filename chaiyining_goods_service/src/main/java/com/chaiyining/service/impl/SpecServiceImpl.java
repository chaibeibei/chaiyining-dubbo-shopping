package com.chaiyining.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaiyining.dao.SpecDao;
import com.chaiyining.pojo.Spec;
import com.chaiyining.pojo.Spec_Option;
import com.chaiyining.service.SpecService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass=SpecService.class)
public class SpecServiceImpl implements SpecService{

	@Autowired
	private SpecDao specDao;
	@Override
	public PageInfo<Spec> list(String name, int page) {
		PageHelper.startPage(page,5);
		List<Spec> list = specDao.list(name);
		PageInfo<Spec> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public int add(Spec spec) {
		int add = specDao.add(spec);
		int i=1;
		List<Spec_Option> options = spec.getOptions();
		for (Spec_Option spec_Option : options) {
			
			Integer id = spec.getId();
			spec_Option.setSpec_id(id);
			//添加规格属性
			int addOption = specDao.addOption(spec_Option);
			
		}
		//返回的是添加数据的条数
		return i;
	}

	@Override
	public int update(Spec spec) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Spec findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBatch(int[] id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
