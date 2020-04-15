package com.yang2019.springboot.fundcompany.service;

public interface FundCompanyService {

	/**
	 * 新增基金公司
	 * 
	 * @param fundCompanyJson
	 * @return
	 */
	public int addFundCompany(String fundCompanyJson);

	/**
	 * 更新基金公司
	 * 
	 * @param fundCompanyJson
	 * @return
	 */
	public String updateFundCompany(String fundCompanyJson);
	
	/**
	 * 查询基金公司
	 * 
	 * @param fundCompanyJson
	 * @return
	 */
	public String getFundCompany(String fundCompanyJson);
}
