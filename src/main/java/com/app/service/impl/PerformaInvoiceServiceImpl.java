package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IPerformaInvoiceDao;
import com.app.model.PerformaInvoice;
import com.app.service.IPerformaInvoiceService;

public class PerformaInvoiceServiceImpl implements IPerformaInvoiceService{

	@Autowired
	private IPerformaInvoiceDao dao;
	
	public Integer savePerformaInvoice(PerformaInvoice p) {
		
		return dao.savePerformaInvoice(p);
		
	}

}
