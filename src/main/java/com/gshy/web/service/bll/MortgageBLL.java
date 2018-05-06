package com.gshy.web.service.bll;

import java.util.List;

import com.darengong.tools.dao.v2.KeyValueParis;
import com.gshy.web.service.entity.Mortgage;
import com.gshy.web.service.enums.AuditStatusEnum;
import com.gshy.web.service.query.MortgageQuery;

public class MortgageBLL extends BaseBLL{

	public List<Mortgage> getByQuery(MortgageQuery query) throws Exception {
		return mortgageDAO.getByQuery(query);
	}

	public int getCount(MortgageQuery query) throws Exception {
		return mortgageDAO.getCount(query);
	}

	public Mortgage getById(long id) throws Exception {
		return mortgageDAO.getOne(id);
		
	}

	public void pass(long id) throws Exception {
		KeyValueParis kv = new KeyValueParis();
		kv.add("audit_state", AuditStatusEnum.AuditSuccess.getValue());
		mortgageDAO.update(kv, id);
	}

	public void fail(long id) throws Exception {
		KeyValueParis kv = new KeyValueParis();
		kv.add("audit_state", AuditStatusEnum.AuditFail.getValue());
		mortgageDAO.update(kv, id);
		
	}

}
