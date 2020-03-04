package com.chaiyining.pojo;

import java.io.Serializable;
import java.util.List;

public class Spec implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 150031535854543872L;
	private Integer id;
	private String spec_name;
	private List<Spec_Option> options;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpec_name() {
		return spec_name;
	}
	public void setSpec_name(String spec_name) {
		this.spec_name = spec_name;
	}
	public List<Spec_Option> getOptions() {
		return options;
	}
	public void setOptions(List<Spec_Option> options) {
		this.options = options;
	}
	public Spec(Integer id, String spec_name, List<Spec_Option> options) {
		super();
		this.id = id;
		this.spec_name = spec_name;
		this.options = options;
	}
	public Spec() {
		super();
	}
	@Override
	public String toString() {
		return "Spec [id=" + id + ", spec_name=" + spec_name + ", options=" + options + "]";
	}

	
	
}
