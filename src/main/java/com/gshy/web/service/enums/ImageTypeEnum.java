package com.gshy.web.service.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ImageTypeEnum {
	AdvanceMoney(1, "待审核"), 
	Mortgage(2, "审核通过");
	
	private int value;
	private String name;

	private ImageTypeEnum(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public static ImageTypeEnum getByName(String name) {
		for (ImageTypeEnum imageTypeEnum : values()) {
			if (imageTypeEnum.name.equals(name)) {
				return imageTypeEnum;
			}
		}
		return null;
	}

	public static ImageTypeEnum getByValue(int value) {
		for (ImageTypeEnum imageTypeEnum : values()) {
			if (imageTypeEnum.getValue() == value) {
				return imageTypeEnum;
			}
		}
		return null;
	}

	public static List<ImageTypeEnum> getAllList() {
		return Arrays.asList(values());
	}

	public static Map<Integer, ImageTypeEnum> getAllMap() {
		Map<Integer, ImageTypeEnum> map = new HashMap<>();
		for (ImageTypeEnum imageTypeEnum : values()) {
			map.put(imageTypeEnum.getValue(), imageTypeEnum);
		}
		return map;
	}

	public static List<String> getNameList() {
		List<String> list = new ArrayList<>();
		for (ImageTypeEnum imageTypeEnum : values()) {
			list.add(imageTypeEnum.name);
		}
		return list;
	}

	public static Map<Integer, String> getNameMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (ImageTypeEnum imageTypeEnum : values()) {
			map.put(imageTypeEnum.value, imageTypeEnum.name);
		}
		return map;
	}
}
