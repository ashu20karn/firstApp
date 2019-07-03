package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IFinancialYearDao;
import com.app.model.Billing;
import com.app.service.IBillingService;

public class FinancialYearServiceImpl implements IBillingService{

	@Autowired
	private IFinancialYearDao dao;
	public Integer saveBilling(Billing p) {
		return null;
	}

}
