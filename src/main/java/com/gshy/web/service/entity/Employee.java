package com.gshy.web.service.entity;

import java.util.Date;

import com.darengong.tools.dao.annotation.Column;
import com.darengong.tools.dao.annotation.Id;
import com.darengong.tools.dao.annotation.Table;

@Table(name="tbl_employee")
public class Employee {
	
	@Id
	private long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="add_time")
	private Date addTime;
	
	@Column(name="update_time")
	private Date updateTime;
	
	@Column(name="valid")
	private int valid; // -1 逻辑删除;默认为1

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
