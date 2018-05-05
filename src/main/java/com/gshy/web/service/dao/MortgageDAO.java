package com.gshy.web.service.dao;

import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.Mortgage;

public class MortgageDAO extends BaseDAO<Mortgage>{
	
	private static final MortgageDAO mortgageDAO = new MortgageDAO();
	
	
	public static MortgageDAO getInstance(){
		return mortgageDAO;
	}
	
	private MortgageDAO() {
		super(Mortgage.class);
	}
}
