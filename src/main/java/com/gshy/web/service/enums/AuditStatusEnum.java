package com.gshy.web.service.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum AuditStatusEnum {

	AuditWait(0, "待审核"), 
	AuditSuccess(1, "审核通过"), 
	AuditFail(2, "审核失败");
	
	private int value;
	private String name;

	private AuditStatusEnum(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public static AuditStatusEnum getByName(String name) {
		for (AuditStatusEnum CarLimitEnum : values()) {
			if (CarLimitEnum.name.equals(name)) {
				return CarLimitEnum;
			}
		}
		return AuditWait;
	}

	public static AuditStatusEnum getByValue(int value) {
		for (AuditStatusEnum CarLimitEnum : values()) {
			if (CarLimitEnum.getValue() == value) {
				return CarLimitEnum;
			}
		}
		return AuditWait;
	}

	public static List<AuditStatusEnum> getAllList() {
		return Arrays.asList(values());
	}

	public static Map<Integer, AuditStatusEnum> getAllMap() {
		Map<Integer, AuditStatusEnum> map = new HashMap<>();
		for (AuditStatusEnum CarLimitEnum : values()) {
			map.put(CarLimitEnum.getValue(), CarLimitEnum);
		}
		return map;
	}

	public static List<String> getNameList() {
		List<String> list = new ArrayList<>();
		for (AuditStatusEnum CarLimitEnum : values()) {
			list.add(CarLimitEnum.name);
		}
		return list;
	}

	public static Map<Integer, String> getNameMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (AuditStatusEnum CarLimitEnum : values()) {
			map.put(CarLimitEnum.value, CarLimitEnum.name);
		}
		return map;
	}
}
