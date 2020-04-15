package com.yang2019.springboot.fundcompany.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang2019.springboot.fundcompany.model.RequestFundCompanyVO;
import com.yang2019.springboot.fundcompany.service.FundCompanyService;
import com.yang2019.springboot.util.JsonUtils;

@RestController
public class FundCompanyController {
	private static final Logger logger = LoggerFactory.getLogger(FundCompanyController.class);

	@Autowired
	FundCompanyService fundCompanyService;

	/**
	 * 新增基金公司
	 * 
	 * @param reqfundCompanyJson
	 * @return
	 */
	@GetMapping("/addFundCompany")
	private String addFundCompany(String reqfundCompanyJson) {
		logger.info("新增基金公司信息--------addFundCompany------");
		RequestFundCompanyVO requestFundCompanyVO = JsonUtils.json2Obj(reqfundCompanyJson, RequestFundCompanyVO.class);
		String fundCompanyVOJson = JsonUtils.obj2Json(requestFundCompanyVO.getFundCompanyVO());
		int addFundCompany = fundCompanyService.addFundCompany(fundCompanyVOJson);
		return addFundCompany + "";
	}

	/**
	 * 更新基金公司
	 * 
	 * @param reqfundCompanyJson
	 * @return
	 */
	@GetMapping("/updFundCompany")
	private String updFundCompany(String reqfundCompanyJson) {
		logger.info("更新基金公司信息--------updFundCompany------");
		RequestFundCompanyVO requestFundCompanyVO = JsonUtils.json2Obj(reqfundCompanyJson, RequestFundCompanyVO.class);
		String fundCompanyVOJson = JsonUtils.obj2Json(requestFundCompanyVO.getFundCompanyVO());
		String res = fundCompanyService.updateFundCompany(fundCompanyVOJson);
		return res;
	}
}
