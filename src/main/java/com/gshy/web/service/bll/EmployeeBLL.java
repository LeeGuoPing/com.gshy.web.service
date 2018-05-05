package com.gshy.web.service.bll;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.darengong.tools.dao.v2.DBQuery;
import com.darengong.tools.dao.v2.KeyValueParis;
import com.gshy.web.service.dao.EmployeeDAO;
import com.gshy.web.service.entity.Employee;

public class EmployeeBLL {
	
	private static final EmployeeDAO employeeDAO = EmployeeDAO.getInstance();
	
	public long addEmployee(Employee employee) throws Exception{
		return employeeDAO.add(employee);
	}
	
	public Employee getByEmail(String email) throws Exception{
		if(StringUtils.isBlank(email)){
			return null;
		}
		DBQuery dbQuery = new DBQuery();
		dbQuery.column("email").equal(email)
		.and().column("valid").equal(1);
		return employeeDAO.getOne(dbQuery);
	}
	
	public Employee getById(long id) throws Exception{
		if(id<=0){
			throw new RuntimeException("参数异常,id is: "+id);
		}
		return employeeDAO.getOne(id);
	}
	
	public int updateById(Employee employee) throws Exception{
		return employeeDAO.update(employee);
	}

	public void removeById(long empId) throws Exception {
		KeyValueParis kv = new KeyValueParis();
		kv.add("valid", -1);
		kv.add("update_time", new Date());
		employeeDAO.update(kv, empId);
		
	}
}
