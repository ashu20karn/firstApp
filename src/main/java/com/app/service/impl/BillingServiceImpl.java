package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IBillingDao;
import com.app.model.Billing;
import com.app.service.IBillingService;

public class BillingServiceImpl implements IBillingService{

	@Autowired
	private IBillingDao dao;
	public Integer saveBilling(Billing b) {
		
		return dao.saveBilling(b);
	}

}
