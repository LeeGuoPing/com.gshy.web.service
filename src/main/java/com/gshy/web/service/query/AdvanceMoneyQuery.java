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
	
	public static class AdvanceMoneyQueryBuilder{
		AdvanceMoneyQuery query = new AdvanceMoneyQuery();
		
		protected AdvanceMoneyQueryBuilder() {
			query.advanceIds = new ArrayList<Long>();
			query.auditStates = new ArrayList<Integer>();
		}
		
		public static AdvanceMoneyQueryBuilder builder(){
			return new AdvanceMoneyQueryBuilder();
		}
		
		public AdvanceMoneyQueryBuilder addAdvanceId(long advanceId){
			if(advanceId>0){
				query.advanceIds.add(advanceId);
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder addAdvanceIds(List<Long> advanceIds){
			if(Objects.nonNull(advanceIds)){
				query.advanceIds.addAll(advanceIds);
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder addCreateEmp(long createEmp){
			if(createEmp>0){
				query.createEmp.add(createEmp);
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder addCreateEmps(List<Long> createEmps){
			if(Objects.nonNull(createEmps)){
				query.createEmp.addAll(createEmps);
			}
			return this;
		} 
		
		public AdvanceMoneyQueryBuilder addAuditEmp(long auditEmp){
			if(auditEmp>0){
				query.auditEmp.add(auditEmp);
			}
			return this;
		} 
		
		public AdvanceMoneyQueryBuilder addAuditEmps(List<Long> auditEmp){
			if(Objects.nonNull(auditEmp)){
				query.auditEmp.addAll(auditEmp);
			}
			return this;
		} 
		
		public AdvanceMoneyQueryBuilder addAuditState(int auditState){
			if(auditState>0){
				query.auditStates.add(auditState);
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder addAuditStates(List<Integer> auditStates){
			if(Objects.nonNull(auditStates)){
				query.auditStates.addAll(auditStates);
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder setOrderBy(String orderBy) {
			if (!Objects.isNull(orderBy) && !"".equals(orderBy)) {
				query.orderBy = orderBy;
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder setPage(int page) {
			if (!Objects.isNull(page) && page != 0) {
				query.page = page;
			}
			return this;
		}
		
		public AdvanceMoneyQueryBuilder setPageSize(int pageSize) {
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
