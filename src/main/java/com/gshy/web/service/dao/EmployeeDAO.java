package com.gshy.web.service.dao;

import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.Employee;

public class EmployeeDAO extends BaseDAO<Employee>{
	
	private static final EmployeeDAO employeeDAO = new EmployeeDAO();
	
	
	public static EmployeeDAO getInstance(){
		return employeeDAO;
	}
	
	private EmployeeDAO() {
		super(Employee.class);
	}

}
