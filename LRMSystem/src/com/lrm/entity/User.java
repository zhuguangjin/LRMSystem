package com.lrm.entity;

/**
 * @author zhuguangjin
 * @brief hibernate测试实体类
 */
public class User {

	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}