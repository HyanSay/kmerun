package com.kmerun.func.fundcompany.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kmerun.func.fundcompany.model.FundCompanyPO;

@Mapper
public interface FundCompanyDao {
    int deleteByPrimaryKey(String fundcompanyid);

    int insert(FundCompanyPO record);

    int insertSelective(FundCompanyPO record);

    FundCompanyPO selectByPrimaryKey(String fundcompanyid);

    int updateByPrimaryKeySelective(FundCompanyPO record);

    int updateByPrimaryKey(FundCompanyPO record);
    
	/**
	 * 新增基金公司信息
	 * @param FundCompanyPO
	 * @return
	 */
	public int insertFundCompany(FundCompanyPO fundCompanyPO);
	/**
	 * 修改基金公司信息
	 * @param FundCompanyPO
	 * @return
	 */
	public int updateFundCompanyByFundCompanyId(FundCompanyPO fundCompanyPO);
	
	/**
	 * 删除基金公司信息
	 * @param FundCompanyPO
	 * @return
	 */
	public int deleteFundCompanyByFundCompanyId(@Param("dFundCompanyId") String dFundCompanyId);
	
	/**
	 * 获取单个基金公司信息
	 * @param fundCompanyId
	 * @return
	 */
	FundCompanyPO getFundCompanyByFundCompanyId(@Param("dFundCompanyId") String dFundCompanyId);
}