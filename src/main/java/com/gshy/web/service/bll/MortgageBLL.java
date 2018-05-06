package com.gshy.web.service.bll;

import java.util.List;

import com.gshy.web.service.entity.Mortgage;
import com.gshy.web.service.query.MortgageQuery;

public class MortgageBLL extends BaseBLL{

	public List<Mortgage> getByQuery(MortgageQuery query) throws Exception {
		return mortgageDAO.getByQuery(query);
	}

	public int getCount(MortgageQuery query) throws Exception {
		return mortgageDAO.getCount(query);
	}

}
