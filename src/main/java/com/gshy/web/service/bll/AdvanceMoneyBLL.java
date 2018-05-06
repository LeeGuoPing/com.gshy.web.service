package com.gshy.web.service.bll;

import java.util.List;

import com.gshy.web.service.entity.AdvanceMoney;
import com.gshy.web.service.query.AdvanceMoneyQuery;

public class AdvanceMoneyBLL extends BaseBLL{

	public List<AdvanceMoney> getByQuery(AdvanceMoneyQuery query) throws Exception {
		return advanceMoneyDAO.getByQuery(query);
	}

	public int getCount(AdvanceMoneyQuery query) throws Exception {
		return advanceMoneyDAO.getCount(query);
	}

}
