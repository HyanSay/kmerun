package com.yang2019.springboot.fundcompany;

import com.yang2019.springboot.fundcompany.model.FundCompanyVO;
import com.yang2019.springboot.fundcompany.model.RequestFundCompanyVO;
import com.yang2019.springboot.util.JsonUtils;

public class FundCompany {
	public static void main(String[] args) {
		RequestFundCompanyVO requestFundCompanyVo = new RequestFundCompanyVO();
		FundCompanyVO fundCompanyVO = new FundCompanyVO();
		fundCompanyVO.setFundCompanyName("2");
		fundCompanyVO.setFundCompanyStatus("1");
		fundCompanyVO.setFundCompanyType("1");
		requestFundCompanyVo.setFundCompanyVO(fundCompanyVO);
		String obj2Json = JsonUtils.obj2Json(requestFundCompanyVo);
		System.out.println(obj2Json);
	}
}
