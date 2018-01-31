package com.wang;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 测试实体类
 * @author user
 *
 */
public class Demo {
	private int id;
	private String name;
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createTime;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
