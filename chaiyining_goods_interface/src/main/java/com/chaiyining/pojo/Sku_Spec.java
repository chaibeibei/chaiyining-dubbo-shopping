package com.chaiyining.pojo;

import java.io.Serializable;

public class Sku_Spec implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5496393993168639901L;
	private Integer id;
	private Integer sku_id;
	private Integer spec_id;
	private Integer spec_option_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSku_id() {
		return sku_id;
	}

	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}

	public Integer getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(Integer spec_id) {
		this.spec_id = spec_id;
	}

	public Integer getSpec_option_id() {
		return spec_option_id;
	}

	public void setSpec_option_id(Integer spec_option_id) {
		this.spec_option_id = spec_option_id;
	}

	public Sku_Spec(Integer id, Integer sku_id, Integer spec_id, Integer spec_option_id) {
		super();
		this.id = id;
		this.sku_id = sku_id;
		this.spec_id = spec_id;
		this.spec_option_id = spec_option_id;
	}

	public Sku_Spec() {
		super();
	}

	@Override
	public String toString() {
		return "Sku_Spec [id=" + id + ", sku_id=" + sku_id + ", spec_id=" + spec_id + ", spec_option_id="
				+ spec_option_id + "]";
	}

}
