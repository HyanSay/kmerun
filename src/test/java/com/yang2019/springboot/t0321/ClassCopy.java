package com.yang2019.springboot.t0321;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.BeanUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.yang2019.springboot.t0321.model.TestDemoDTO;
import com.yang2019.springboot.t0321.model.TestDemoFrom;

public class ClassCopy {

	public static void main(String[] args) {
			TestDemoFrom testDemoFrom = new TestDemoFrom();
			HashMap<String, String> map = Maps.newHashMap();
			map.put("001", "北京");
			map.put("002", "上海");
			map.put("003", "广州");
			testDemoFrom.setCitys(map);
			testDemoFrom.setFlag(true);
			testDemoFrom.setGmtStart(new Date());
			testDemoFrom.setName("诺言");
			testDemoFrom.setAge(18);
			testDemoFrom.setTypes(Lists.newArrayList("我爱", "宝贝"));
			System.out.printf(testDemoFrom.toString() + "\n");
			// 下面就可以开始转化了，就一行代码
			TestDemoDTO testDemoDTO = new TestDemoDTO();
			BeanUtils.copyProperties(testDemoFrom, testDemoDTO);

			System.out.println(testDemoDTO.toString());
		}
}
