package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.FinancialYear;
@Component
public interface IFinancialYearDao {

	public Integer saveFinancialYear(FinancialYear f);
}
