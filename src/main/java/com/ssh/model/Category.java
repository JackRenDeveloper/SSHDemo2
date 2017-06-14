package com.ssh.model;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID = -6743915068430099971L;
	private Integer id;
	private String type;
	private boolean hot;
	
	public Category() {
		super();
	}
	public Category(String type, boolean hot) {
		super();
		this.type = type;
		this.hot = hot;
	}
	public Category(Integer id, String type, boolean hot) {
		super();
		this.id = id;
		this.type = type;
		this.hot = hot;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + ", hot=" + hot + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	
}
