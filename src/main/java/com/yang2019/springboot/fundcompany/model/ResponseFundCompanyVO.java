package com.yang2019.springboot.fundcompany.model;

import com.yang2019.springboot.common.CommonVO;

public class ResponseFundCompanyVO extends CommonVO {
	private FundCompanyVO fundCompanyVO;

	public FundCompanyVO getFundCompanyVO() {
		return fundCompanyVO;
	}

	public void setFundCompanyVO(FundCompanyVO fundCompanyVO) {
		this.fundCompanyVO = fundCompanyVO;
	}

}
