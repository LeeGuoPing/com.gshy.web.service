package com.gshy.web.service.dao;

import java.util.List;
import java.util.Objects;

import com.bj58.wf.log.Log;
import com.darengong.tools.dao.v2.DBQuery;
import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.AdvanceMoney;
import com.gshy.web.service.query.AdvanceMoneyQuery;

public class AdvanceMoneyDAO extends BaseDAO<AdvanceMoney>{
	
	private static final AdvanceMoneyDAO advanceMoneyDAO = new AdvanceMoneyDAO();
	
	protected Log log = com.bj58.wf.log.LogFactory.getLog(AdvanceMoneyDAO.class);
	
	public static AdvanceMoneyDAO getInstance(){
		return advanceMoneyDAO;
	}
	
	private AdvanceMoneyDAO() {
		super(AdvanceMoney.class);
	}
	
	public int getCount(AdvanceMoneyQuery query) throws Exception{
		DBQuery dbQuery = toDBQuery(query,false);
		return daoHelper.count(dbQuery);
	}
	
	public List<AdvanceMoney> getByQuery(AdvanceMoneyQuery query) throws Exception{
		DBQuery dbQuery = toDBQuery(query,true);
		return daoHelper.selectByQuery(clazz, dbQuery);
	} 

	private DBQuery toDBQuery(AdvanceMoneyQuery query,boolean usePage) throws Exception {
		
		
		DBQuery dbQuery = getUnitDBQuery(query,usePage);
		dbQuery.where();
		
		queryWithList(dbQuery, query.getAdvanceIds(), "id");
		queryWithList(dbQuery, query.getAuditStates(), "audit_state");
		queryWithList(dbQuery, query.getCreateEmp(), "create_emp");
		queryWithList(dbQuery, query.getAuditEmp(), "create_emp");
		queryWithDateRange(dbQuery,query.getCreatTime(),"create_time");
		queryWithDateRange(dbQuery, query.getAuditTime(), "audit_time");
		dbQuery.column("valid").equal(0);
		if (!Objects.isNull(query.getOrderBy())) {
			dbQuery.orderBy(query.getOrderBy());
		}

		if (usePage && query.getPage() >= 1 && query.getPageSize() >= 1) {
			int start = (query.getPage() - 1) * query.getPageSize();
			int size = query.getPageSize();
			dbQuery.limit(start, size);
		}
		log.info("dbQuery is {}" + dbQuery.toString());
		return dbQuery;
	}
	
	private DBQuery getUnitDBQuery(AdvanceMoneyQuery query, boolean usePage) throws Exception {
		DBQuery dbQuery = new DBQuery();
		if (usePage) {
			dbQuery.distinct("*");
		} else {
			dbQuery.select("count(id)");
		}

		dbQuery.from("tbl_advance_money");
		
		return dbQuery;
	}

}
