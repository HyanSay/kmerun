package com.kmerun.func.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ApplicationInfoConfig {

	private Map<String, String> number = new HashMap<>(); // 接收prop1里面的属性值

	public Map<String, String> getNumber() {
		return number;
	}

	public void setNumber(Map<String, String> number) {
		this.number = number;
	}

}
