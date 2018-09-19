package com.code.test;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private transient String sex;
	private int id;
	private String name;
	private Date brithday;
	private static String memo="∫√»À";
	private Clothing clothing;
	public User() {
		super();
	}
	public User(String sex, int id, String name, Date brithday, Clothing clothing) {
		super();
		this.sex = sex;
		this.id = id;
		this.name = name;
		this.brithday = brithday;
		this.clothing = clothing;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public static String getMemo() {
		return memo;
	}
	public static void setMemo(String memo) {
		User.memo = memo;
	}
	public Clothing getClothing() {
		return clothing;
	}
	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brithday == null) ? 0 : brithday.hashCode());
		result = prime * result + ((clothing == null) ? 0 : clothing.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (brithday == null) {
			if (other.brithday != null)
				return false;
		} else if (!brithday.equals(other.brithday))
			return false;
		if (clothing == null) {
			if (other.clothing != null)
				return false;
		} else if (!clothing.equals(other.clothing))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", brithday=" + brithday + ", clothing=" + clothing + "]";
	}
	
	
	
}
