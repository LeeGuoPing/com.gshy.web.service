package com.gshy.web.service.interceptors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bj58.wf.mvc.ActionResult;
import com.bj58.wf.mvc.BeatContext;
import com.bj58.wf.mvc.interceptor.ActionInterceptor;
import com.bj58.ycs.tool.webutil.actionresult.ActionResult4Javascript;
import com.gshy.web.service.bll.EmployeeBLL;
import com.gshy.web.service.entity.Employee;


public class LoginInterceptor implements ActionInterceptor {
	
	private static final EmployeeBLL employeeBLL = new EmployeeBLL();
	
	private Log log = LogFactory.getLog(LoginInterceptor.class);
	
	
	
	public ActionResult preExecute(BeatContext beat) {
		try {
			HttpServletRequest request = beat.getRequest();
			Cookie[] cookies = request.getCookies();
			if(cookies!=null){
				for (Cookie cookie : cookies) {
					if("uid".equals(cookie.getName())){
						String uid = cookie.getValue();
						long userId = Long.parseLong(uid);
						Employee employee = employeeBLL.getById(userId);
						if(employee!=null){
							return null;
						}
					}
				}
			}
			
			return ActionResult.redirect("http://admin.haoyejinfu.com:8088/login");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ActionResult4Javascript("alert(\"无法判断的情形！\");history.go(-1);");
	}


	

}