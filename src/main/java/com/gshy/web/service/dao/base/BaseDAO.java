package com.gshy.web.service.dao.base;

import java.util.List;
import java.util.Objects;

import com.darengong.tools.dao.v2.DBQuery;
import com.darengong.tools.dao.v2.KeyValueParis;

public class BaseDAO<T> extends DAOHelper implements IDAO<T> {

	protected Class<T> clazz;
	protected BaseDAO(Class<T> clazz){
		this.clazz = clazz;
	}
	
	
	public long add(T t) throws Exception {
		Object insert = daoHelper.insert(t);
		if(null!=insert){
			return (Long)insert;
		}
		return -1;
	}

	public void add(List<T> list) throws Exception {
		daoHelper.batchInsert(list);
	}

	public int update(T t) throws Exception {
		return daoHelper.update(t);
	}

	public int update(KeyValueParis keyValueParis, long id) throws Exception {
		return daoHelper.updateByID(clazz, keyValueParis, id);
	}
	

	public int update(KeyValueParis keyValueParis, DBQuery query) throws Exception {
		return daoHelper.updateByQuery(clazz, keyValueParis, query);
	}
	
	public T getOne(long id) throws Exception {
		return daoHelper.getByID(clazz, id);
	}

	public T getOne(DBQuery query) throws Exception {
		return daoHelper.getOneByQuery(clazz, query, "", "");
	}

	public T getOne(DBQuery query, String orderBy) throws Exception {
		return daoHelper.getOneByQuery(clazz, query, null, orderBy);
	}

	public List<T> getList(DBQuery query, int page, int size, String orderBy) throws Exception {
		return daoHelper.getsByQuery(clazz, query, page, size, null, orderBy);
	}

	public int countByQuery(DBQuery query) throws Exception {
		return daoHelper.count(query);
	}

	public int deleteById(long id) throws Exception {
		return daoHelper.deleteByID(clazz, id);
	}

	public int delete(DBQuery query) throws Exception {
		return daoHelper.deleteByQuery(clazz, query);
	}
	
	public <E> void queryWithList(DBQuery query, List<E> list, String column) throws Exception {
		if (!Objects.isNull(list) && !list.isEmpty()) {
			if (list.size() == 1) {
				queryWithObject(query, list.get(0), column);
			}else {
				query.column(column).inList(list).and();
			}
		}
	}
	public void queryWithObject(DBQuery query, Object obj, String column) throws Exception {
		if (!Objects.isNull(obj)) {
			query.column(column).equal(obj).and();
		}
	}
	
}
