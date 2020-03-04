package com.chaiyining.pojo;

import java.io.Serializable;

public class Spec_Option implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5000863344563130690L;
	private Integer id;
	private String option_name;
	private Integer spec_id;
	private Integer orders=0;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOption_name() {
		return option_name;
	}

	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}

	public Integer getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(Integer spec_id) {
		this.spec_id = spec_id;
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public Spec_Option(Integer id, String option_name, Integer spec_id, Integer orders) {
		super();
		this.id = id;
		this.option_name = option_name;
		this.spec_id = spec_id;
		this.orders = orders;
	}

	public Spec_Option() {
		super();
	}

	@Override
	public String toString() {
		return "Spec_Option [id=" + id + ", option_name=" + option_name + ", spec_id=" + spec_id + ", orders=" + orders
				+ "]";
	}

}
