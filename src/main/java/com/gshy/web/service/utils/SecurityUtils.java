package com.gshy.web.service.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.bj58.wf.mvc.BeatContext;
import com.gshy.web.service.bll.EmployeeBLL;
import com.gshy.web.service.entity.Employee;

public class SecurityUtils {
	
	private static final EmployeeBLL employeeBLL = new EmployeeBLL();
	
	public static long currentUserId(BeatContext beat) throws Exception{
		HttpServletRequest request = beat.getRequest();
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("uid".equals(cookie.getName())){
					String uid = cookie.getValue();
					long userId = Long.parseLong(uid);
					Employee employee = employeeBLL.getById(userId);
					if(employee!=null){
						return employee.getId();
					}
				}
			}
		}
		return -1;
	}
	
	public static Employee currentUserInfo(BeatContext beat) throws Exception{
		HttpServletRequest request = beat.getRequest();
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("uid".equals(cookie.getName())){
					String uid = cookie.getValue();
					long userId = Long.parseLong(uid);
					Employee employee = employeeBLL.getById(userId);
					if(employee!=null){
						return employee;
					}
				}
			}
		}
		return null;
	}
}
