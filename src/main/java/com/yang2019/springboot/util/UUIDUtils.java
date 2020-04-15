package com.yang2019.springboot.util;

import java.util.UUID;

public class UUIDUtils {
	/**
	 * @return UUID
	 */
	public static String genUUID(){
		return UUID.randomUUID().toString();
	}
	
	/**
	 * @return 不带中横线的UUID
	 */
	public static String genUUID2(){
		return genUUID().replaceAll("\\-", "");
	}
}
