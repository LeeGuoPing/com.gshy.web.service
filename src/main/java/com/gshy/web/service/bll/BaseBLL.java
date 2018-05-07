package com.gshy.web.service.bll;

import com.gshy.web.service.dao.AdvanceMoneyDAO;
import com.gshy.web.service.dao.EmployeeDAO;
import com.gshy.web.service.dao.ImageDAO;
import com.gshy.web.service.dao.MortgageDAO;

public class BaseBLL {
	
	protected static final EmployeeDAO employeeDAO = EmployeeDAO.getInstance();
	
	protected static final MortgageDAO mortgageDAO = MortgageDAO.getInstance();
	
	protected static final AdvanceMoneyDAO advanceMoneyDAO = AdvanceMoneyDAO.getInstance();
	
	protected static final ImageDAO imageDAO = ImageDAO.getInstance();
	
	
}
