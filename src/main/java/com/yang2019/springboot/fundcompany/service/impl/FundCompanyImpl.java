package com.yang2019.springboot.fundcompany.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang2019.springboot.common.Constants;
import com.yang2019.springboot.fundcompany.dao.FundCompanyDao;
import com.yang2019.springboot.fundcompany.model.FundCompanyPO;
import com.yang2019.springboot.fundcompany.model.FundCompanyVO;
import com.yang2019.springboot.fundcompany.model.ResponseFundCompanyVO;
import com.yang2019.springboot.fundcompany.service.FundCompanyService;
import com.yang2019.springboot.util.JsonUtils;
import com.yang2019.springboot.util.UUIDUtils;

@Service
public class FundCompanyImpl implements FundCompanyService {
	private static final Logger logger = LoggerFactory.getLogger(FundCompanyImpl.class);

	@Autowired
	private FundCompanyDao fundCompanyDao;

	@Override
	public int addFundCompany(String fundCompanyJson) {
		logger.info("新增基金公司，信息为：" + fundCompanyJson);
		FundCompanyVO fundCompanyVO = JsonUtils.json2Obj(fundCompanyJson, FundCompanyVO.class);
		FundCompanyPO fundCompanyPO = new FundCompanyPO();
		BeanUtils.copyProperties(fundCompanyVO, fundCompanyPO);
		fundCompanyPO.setFundCompanyId(UUIDUtils.genUUID2());
		fundCompanyPO.setAddTime(new Date());
		int fundCompanyCount = fundCompanyDao.insertFundCompany(fundCompanyPO);
		return fundCompanyCount;
	}

	@Override
	public String updateFundCompany(String fundCompanyJson) {
		logger.info("更新基金公司，信息为：" + fundCompanyJson);
		FundCompanyVO fundCompanyVO = JsonUtils.json2Obj(fundCompanyJson, FundCompanyVO.class);
		FundCompanyPO fundCompanyPO = new FundCompanyPO();
		BeanUtils.copyProperties(fundCompanyVO, fundCompanyPO);
		fundCompanyPO.setUpdateTime(new Date());
		int res = fundCompanyDao.updateFundCompanyByFundCompanyId(fundCompanyPO);
		ResponseFundCompanyVO responseFundCompanyVO = new ResponseFundCompanyVO();
		String resJson = null;
		if (res > 0) {
			responseFundCompanyVO.setErrorCode(Constants.EXCEPTION_CODE_SUCCESS);
			responseFundCompanyVO.setErrorStatus(Constants.DEFAULT_SUCCESS);
			responseFundCompanyVO.setErrorMsg(Constants.EXCEPTION_MSG_UPD_SUCCESS);
		} else {
			responseFundCompanyVO.setErrorCode(Constants.EXCEPTION_CODE_UPD_FAIL);
			responseFundCompanyVO.setErrorStatus(Constants.DEFAULT_FAIL);
			responseFundCompanyVO.setErrorMsg(Constants.EXCEPTION_MSG_UPD_FAIL);
		}
		resJson = JsonUtils.obj2Json(responseFundCompanyVO);
		logger.info("更新基金公司结束，" + resJson);
		return resJson;
	}

	@Override
	public String getFundCompany(String fundCompanyJson) {
		logger.info("查询基金公司，信息为：" + fundCompanyJson);
		return null;
	}

}
