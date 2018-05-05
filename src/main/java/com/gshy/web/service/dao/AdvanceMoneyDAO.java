package com.gshy.web.service.dao;

import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.AdvanceMoney;

public class AdvanceMoneyDAO extends BaseDAO<AdvanceMoney>{
	
	private static final AdvanceMoneyDAO advanceMoneyDAO = new AdvanceMoneyDAO();
	
	public static AdvanceMoneyDAO getInstance(){
		return advanceMoneyDAO;
	}
	
	private AdvanceMoneyDAO() {
		super(AdvanceMoney.class);
	}

}
