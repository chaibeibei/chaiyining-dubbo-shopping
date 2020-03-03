package com.chaiyining.pojo;

import java.io.Serializable;

public class Spec implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 150031535854543872L;
	private Integer id           ;
	private String spec_name    ;
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
	public Spec(Integer id, String spec_name) {
		super();
		this.id = id;
		this.spec_name = spec_name;
	}
	public Spec() {
		super();
	}
	@Override
	public String toString() {
		return "Spec [id=" + id + ", spec_name=" + spec_name + "]";
	}

	
	
	
}
