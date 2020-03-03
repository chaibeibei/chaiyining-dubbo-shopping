package com.chaiyining.pojo;

import java.io.Serializable;

public class Spu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6472973485116679217L;
	private Integer id               ;
	private String goods_name       ;
	private String is_marketable    ;
	private Integer brand_id         ;
	private String caption          ;
	private Integer category_id      ;
	private String small_pic        ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getIs_marketable() {
		return is_marketable;
	}
	public void setIs_marketable(String is_marketable) {
		this.is_marketable = is_marketable;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getSmall_pic() {
		return small_pic;
	}
	public void setSmall_pic(String small_pic) {
		this.small_pic = small_pic;
	}
	public Spu(Integer id, String goods_name, String is_marketable, Integer brand_id, String caption,
			Integer category_id, String small_pic) {
		super();
		this.id = id;
		this.goods_name = goods_name;
		this.is_marketable = is_marketable;
		this.brand_id = brand_id;
		this.caption = caption;
		this.category_id = category_id;
		this.small_pic = small_pic;
	}
	public Spu() {
		super();
	}
	@Override
	public String toString() {
		return "Spu [id=" + id + ", goods_name=" + goods_name + ", is_marketable=" + is_marketable + ", brand_id="
				+ brand_id + ", caption=" + caption + ", category_id=" + category_id + ", small_pic=" + small_pic + "]";
	}

	
}
