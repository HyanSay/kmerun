package com.kmerun.func.fundcompany.model;

import java.util.Date;

public class FundCompanyDTO {
	private String fundCompanyId;

	private String fundCompanyName;

	private String fundCompanyType;

	private String fundCompanyStatus;

	private Date addTime;

	private Date updateTime;

	public String getFundCompanyId() {
		return fundCompanyId;
	}

	public void setFundCompanyId(String fundCompanyId) {
		this.fundCompanyId = fundCompanyId;
	}

	public String getFundCompanyName() {
		return fundCompanyName;
	}

	public void setFundCompanyName(String fundCompanyName) {
		this.fundCompanyName = fundCompanyName;
	}

	public String getFundCompanyType() {
		return fundCompanyType;
	}

	public void setFundCompanyType(String fundCompanyType) {
		this.fundCompanyType = fundCompanyType;
	}

	public String getFundCompanyStatus() {
		return fundCompanyStatus;
	}

	public void setFundCompanyStatus(String fundCompanyStatus) {
		this.fundCompanyStatus = fundCompanyStatus;
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