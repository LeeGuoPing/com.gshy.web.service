package com.gshy.web.service.dao;

import java.util.List;
import java.util.Objects;

import com.darengong.tools.dao.v2.DBQuery;
import com.gshy.web.service.dao.base.BaseDAO;
import com.gshy.web.service.entity.Mortgage;
import com.gshy.web.service.query.MortgageQuery;

public class MortgageDAO extends BaseDAO<Mortgage>{
	
	private static final MortgageDAO mortgageDAO = new MortgageDAO();
	
	
	public static MortgageDAO getInstance(){
		return mortgageDAO;
	}
	
	private MortgageDAO() {
		super(Mortgage.class);
	}
	
	public int getCount(MortgageQuery query) throws Exception{
		DBQuery dbQuery = toDBQuery(query,false);
		return daoHelper.count(dbQuery);
	}
	
	public List<Mortgage> getByQuery(MortgageQuery query) throws Exception{
		DBQuery dbQuery = toDBQuery(query,true);
		return daoHelper.selectByQuery(clazz, dbQuery);
	} 

	private DBQuery toDBQuery(MortgageQuery query,boolean usePage) throws Exception {
		
		DBQuery dbQuery = getUnitDBQuery(query,usePage);
		dbQuery.where();
		
		queryWithList(dbQuery, query.getAuditStates(), "audit_state");
		queryWithList(dbQuery, query.getMortgageIds(), "id");
		queryWithList(dbQuery, query.getSituations(), "situation");
		queryWithList(dbQuery, query.getCreateEmp(), "create_emp");
		queryWithList(dbQuery, query.getAuditEmp(), "create_emp");
		
		dbQuery.column("valid").equal(0);
		if (!Objects.isNull(query.getOrderBy())) {
			dbQuery.orderBy(query.getOrderBy());
		}

		if (usePage && query.getPage() >= 1 && query.getPageSize() >= 1) {
			int start = (query.getPage() - 1) * query.getPageSize();
			int size = query.getPageSize();
			dbQuery.limit(start, size);
		}
		System.out.println(dbQuery.toSql()+"  : "+dbQuery.values());
		return dbQuery;
	}
	
	private DBQuery getUnitDBQuery(MortgageQuery query, boolean usePage) throws Exception {
		DBQuery dbQuery = new DBQuery();
		if (usePage) {
			dbQuery.distinct("id");
		} else {
			dbQuery.select("count(id)");
		}

		dbQuery.from("tbl_mortgage");

		return dbQuery;
	}
}
