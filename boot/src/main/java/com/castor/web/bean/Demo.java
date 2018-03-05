package com.castor.web.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "demo")
@Entity//加入这个注解，Demo就会进行持久化了，在这里没有对@Table进行配置，请自行配置。
public class Demo {

	@Id @GeneratedValue
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
