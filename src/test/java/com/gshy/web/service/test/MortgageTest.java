package com.gshy.web.service.test;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.gshy.web.service.bll.MortgageBLL;
import com.gshy.web.service.entity.Mortgage;
import com.gshy.web.service.query.MortgageQuery.MortgageQueryBuilder;

public class MortgageTest {
	MortgageBLL mortgageBLL = new MortgageBLL();
	
	@Test
	public void test() throws Exception{
		List<Mortgage> mortgages = mortgageBLL.getByQuery(MortgageQueryBuilder.builder().build());
		System.out.println(JSON.toJSONString(mortgages.get(0)));
	}
}
