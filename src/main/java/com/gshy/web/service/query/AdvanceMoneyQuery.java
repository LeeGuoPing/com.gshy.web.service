package com.gshy.web.service.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdvanceMoneyQuery {
	
	private List<Long> advanceIds;
	
	private List<Long> createEmp;
	
	private List<Long> auditEmp;
	
	private List<Integer> auditStates;
	
	private String orderBy;
	
	private int page;
	
	private int pageSize;

	public List<Long> getCreateEmp() {
		return createEmp;
	}

	public List<Long> getAuditEmp() {
		return auditEmp;
	}

	public List<Integer> getAuditStates() {
		return auditStates;
	}
	
	public List<Long> getAdvanceIds() {
		return advanceIds;
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
		AdvanceMoneyQuery query = new AdvanceMoneyQuery();
		
		protected MortgageQueryBuilder() {
			query.advanceIds = new ArrayList<Long>();
			query.auditStates = new ArrayList<Integer>();
		}
		
		public static MortgageQueryBuilder builder(){
			return new MortgageQueryBuilder();
		}
		
		public MortgageQueryBuilder addAdvanceId(long advanceId){
			if(advanceId>0){
				query.advanceIds.add(advanceId);
			}
			return this;
		}
		
		public MortgageQueryBuilder addAdvanceIds(List<Long> advanceIds){
			if(Objects.nonNull(advanceIds)){
				query.advanceIds.addAll(advanceIds);
			}
			return this;
		}
		
		public MortgageQueryBuilder addCreateEmp(long createEmp){
			if(createEmp>0){
				query.createEmp.add(createEmp);
			}
			return this;
		}
		
		public MortgageQueryBuilder addCreateEmps(List<Long> createEmps){
			if(Objects.nonNull(createEmps)){
				query.createEmp.addAll(createEmps);
			}
			return this;
		} 
		
		public MortgageQueryBuilder addAuditEmp(long auditEmp){
			if(auditEmp>0){
				query.auditEmp.add(auditEmp);
			}
			return this;
		} 
		
		public MortgageQueryBuilder addAuditEmps(List<Long> auditEmp){
			if(Objects.nonNull(auditEmp)){
				query.auditEmp.addAll(auditEmp);
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
		
		public AdvanceMoneyQuery build() {
			return query;
		}
		
		
	}
}
