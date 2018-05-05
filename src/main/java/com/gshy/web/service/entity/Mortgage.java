package com.gshy.web.service.entity;

import java.util.Date;

import com.darengong.tools.dao.annotation.Column;
import com.darengong.tools.dao.annotation.Id;
import com.darengong.tools.dao.annotation.Table;

/**
 * 
 * @author liguoping
 *
 *         2018年5月5日-下午9:10:10
 *
 * @function 房抵资料报送
 */
@Table(name="tbl_mortgage")
public class Mortgage {
	
	@Id
	private long id;

	@Column(name = "situation")
	private int situation; // 抵押情况 1,一抵;2 二抵'

	@Column(name = "first_balance")
	private double firstBalance; // 一抵余额

	@Column(name = "second_balance")
	private double secondBalance; // 二抵余额

	@Column(name = "borrow_money")
	private double borrowMoney; // 本次借款金额

	@Column(name = "create_emp")
	private long createEmp;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "audit_emp")
	private long auditEmp;

	@Column(name = "audit_time")
	private Date auditTime;

	@Column(name = "audit_state")
	private int auditState;

	@Column(name = "valid")
	private int valid;

	@Column(name = "remark")
	private String remark;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getSituation() {
		return situation;
	}

	public void setSituation(int situation) {
		this.situation = situation;
	}

	public double getFirstBalance() {
		return firstBalance;
	}

	public void setFirstBalance(double firstBalance) {
		this.firstBalance = firstBalance;
	}

	public double getSecondBalance() {
		return secondBalance;
	}

	public void setSecondBalance(double secondBalance) {
		this.secondBalance = secondBalance;
	}

	public double getBorrowMoney() {
		return borrowMoney;
	}

	public void setBorrowMoney(double borrowMoney) {
		this.borrowMoney = borrowMoney;
	}

	public long getCreateEmp() {
		return createEmp;
	}

	public void setCreateEmp(long createEmp) {
		this.createEmp = createEmp;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getAuditEmp() {
		return auditEmp;
	}

	public void setAuditEmp(long auditEmp) {
		this.auditEmp = auditEmp;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public int getAuditState() {
		return auditState;
	}

	public void setAuditState(int auditState) {
		this.auditState = auditState;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
