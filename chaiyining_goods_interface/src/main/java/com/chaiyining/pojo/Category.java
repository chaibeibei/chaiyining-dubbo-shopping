package com.chaiyining.pojo;

import java.io.Serializable;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2434271642937297626L;
	private Integer id;
	private Integer parent_id;
	private String name;
	private String path;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Category(Integer id, Integer parent_id, String name, String path) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.name = name;
		this.path = path;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", parent_id=" + parent_id + ", name=" + name + ", path=" + path + "]";
	}

}
