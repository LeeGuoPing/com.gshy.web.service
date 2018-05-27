package com.gshy.web.service.bll;

import java.util.Date;
import java.util.List;

import com.darengong.tools.dao.v2.KeyValueParis;
import com.gshy.web.service.entity.AdvanceMoney;
import com.gshy.web.service.enums.AuditStatusEnum;
import com.gshy.web.service.query.AdvanceMoneyQuery;

public class AdvanceMoneyBLL extends BaseBLL{

	public List<AdvanceMoney> getByQuery(AdvanceMoneyQuery query) throws Exception {
		return advanceMoneyDAO.getByQuery(query);
	}

	public int getCount(AdvanceMoneyQuery query) throws Exception {
		return advanceMoneyDAO.getCount(query);
	}

	public AdvanceMoney getById(long id) throws Exception {
		return advanceMoneyDAO.getOne(id);
	}

	public void pass(long id,long auditEmp) throws Exception {
		KeyValueParis kv = new KeyValueParis();
		kv.add("audit_state", AuditStatusEnum.AuditSuccess.getValue());
		kv.add("audit_emp", auditEmp);
		kv.add("audit_time", new Date());
		advanceMoneyDAO.update(kv, id);
	}

	public void fail(long id,long auditEmp) throws Exception {
		KeyValueParis kv = new KeyValueParis();
		kv.add("audit_state", AuditStatusEnum.AuditFail.getValue());
		kv.add("audit_emp", auditEmp);
		kv.add("audit_time", new Date());
		advanceMoneyDAO.update(kv, id);
		
	}

	public long insert(AdvanceMoney ad) throws Exception {
		return advanceMoneyDAO.add(ad);
	}

}
