package com.kmerun.func.fundcompany.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmerun.func.fundcompany.model.RequestFundCompanyVO;
import com.kmerun.func.fundcompany.service.FundCompanyService;
import com.kmerun.func.util.JsonUtils;

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
	
	/**
	 * 查询基金公司
	 * 
	 * @param
	 * @return
	 */
	@GetMapping("/getFundCompany")
	private String getFundCompany(String reqfundCompanyJson) {
		logger.info("查询基金公司信息--------getFundCompany------");
		RequestFundCompanyVO requestFundCompanyVO = JsonUtils.json2Obj(reqfundCompanyJson, RequestFundCompanyVO.class);
		String fundCompanyVOJson = JsonUtils.obj2Json(requestFundCompanyVO.getFundCompanyVO());
		String res = fundCompanyService.getFundCompany(fundCompanyVOJson);
		return res;
	}
}
