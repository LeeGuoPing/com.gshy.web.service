package com.gshy.web.service.bll;

import com.gshy.web.service.dao.EmployeeDAO;
import com.gshy.web.service.dao.MortgageDAO;

public class BaseBLL {
	
	protected static final EmployeeDAO employeeDAO = EmployeeDAO.getInstance();
	
	protected static final MortgageDAO mortgageDAO = MortgageDAO.getInstance();
}
