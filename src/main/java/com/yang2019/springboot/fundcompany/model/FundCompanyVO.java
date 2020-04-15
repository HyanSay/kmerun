package com.yang2019.springboot.fundcompany.model;

public class FundCompanyVO {
	private String fundCompanyId;
	private String fundCompanyCode;
	private String fundCompanyName;
	private String fundCompanyType;
	private String fundCompanyStatus;
	private String updateTime;

	public String getFundCompanyId() {
		return fundCompanyId;
	}

	public void setFundCompanyId(String fundCompanyId) {
		this.fundCompanyId = fundCompanyId;
	}

	public String getFundCompanyCode() {
		return fundCompanyCode;
	}

	public void setFundCompanyCode(String fundCompanyCode) {
		this.fundCompanyCode = fundCompanyCode;
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

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}