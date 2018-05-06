package com.gshy.web.service.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MortgageQuery {
	
	private List<Long> mortgageIds;
	
	private List<Integer> situations;
	
	private long createEmp;
	
	private long auditEmp;
	
	private List<Integer> auditStates;
	
	private String orderBy;
	
	private int page;
	
	private int pageSize;

	public List<Long> getMortgageIds() {
		return mortgageIds;
	}

	public List<Integer> getSituations() {
		return situations;
	}

	public long getCreateEmp() {
		return createEmp;
	}

	public long getAuditEmp() {
		return auditEmp;
	}

	public List<Integer> getAuditStates() {
		return auditStates;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public int getPage() {
		return page;
	}

	public int getPageSize() {
		return pageSize;
	}
	
	public static class MortgageQueryBuilder{
		MortgageQuery query = new MortgageQuery();
		
		protected MortgageQueryBuilder() {
			query.auditStates = new ArrayList<Integer>();
			query.mortgageIds = new ArrayList<Long>();
			query.situations = new ArrayList<Integer>();
		}
		
		public static MortgageQueryBuilder builder(){
			return new MortgageQueryBuilder();
		}
		
		public MortgageQueryBuilder addMortgageId(long mortgageId){
			if(mortgageId>0){
				query.mortgageIds.add(mortgageId);
			}
			return this;
		}
		
		public MortgageQueryBuilder addMortgageIds(List<Long> mortgageIds){
			if(Objects.nonNull(mortgageIds)){
				query.mortgageIds.addAll(mortgageIds);
			}
			return this;
		}
		
		public MortgageQueryBuilder addSituation(int situation){
			if(situation>0){
				query.situations.add(situation);
			}
			return this;
		}
		
		public MortgageQueryBuilder addSituations(List<Integer> situations){
			if(Objects.nonNull(situations)){
				query.situations.addAll(situations);
			}
			return this;
		}
		
		public MortgageQueryBuilder addCreateEmp(long createEmp){
			if(createEmp>0){
				query.createEmp = createEmp;
			}
			return this;
		} 
		
		public MortgageQueryBuilder addAuditEmp(long auditEmp){
			if(auditEmp>0){
				query.auditEmp = auditEmp;
			}
			return this;
		} 
		
		public MortgageQueryBuilder addAuditState(int auditState){
			if(auditState>0){
				query.auditStates.add(auditState);
			}
			return this;
		}
		
		public MortgageQueryBuilder addAuditStates(List<Integer> auditStates){
			if(Objects.nonNull(auditStates)){
				query.auditStates.addAll(auditStates);
			}
			return this;
		}
		
		public MortgageQueryBuilder setOrderBy(String orderBy) {
			if (!Objects.isNull(orderBy) && !"".equals(orderBy)) {
				query.orderBy = orderBy;
			}
			return this;
		}
		
		public MortgageQueryBuilder setPage(int page) {
			if (!Objects.isNull(page) && page != 0) {
				query.page = page;
			}
			return this;
		}
		
		public MortgageQueryBuilder setPageSize(int pageSize) {
			if (!Objects.isNull(pageSize) && pageSize != 0) {
				query.pageSize = pageSize;
			}
			return this;
		}
		
		public MortgageQuery build() {
			return query;
		}
		
		
	}
}
