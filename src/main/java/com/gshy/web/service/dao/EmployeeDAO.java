package com.gshy.web.service.dao;

import java.util.List;

import com.darengong.tools.dao.v2.DBQuery;
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
	
	public List<Employee> getAllEmployee() throws Exception{
		DBQuery dbQuery = new DBQuery();
		dbQuery.select().from("tbl_employee");
		return daoHelper.selectByQuery(clazz, dbQuery);
	}

}
