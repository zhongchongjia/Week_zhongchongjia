package com.zhongchongjia.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private BigInteger id;
	private String name;
	private Integer age;
	private BigDecimal sail;
	private Date time;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSail() {
		return sail;
	}
	public void setSail(BigDecimal sail) {
		this.sail = sail;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public TPS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TPS(BigInteger id, String name, Integer age, BigDecimal sail, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sail = sail;
		this.time = time;
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", sail=" + sail + ", time=" + time + "]";
	}

	
}
