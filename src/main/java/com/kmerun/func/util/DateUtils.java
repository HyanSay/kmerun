package com.kmerun.func.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class DateUtils {

	private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);
	public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";// 时间格式

	public static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
		String dateStr = sdf.format(date);
		return dateStr;
	}

	public static Date parseDate(String dateStr) {
		Date date = null;
		if (!StringUtils.isEmpty(dateStr)) {
			SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
			try {
				date = sdf.parse(dateStr);
			} catch (ParseException e) {
				logger.error(e.getMessage(), e);
			}
		}
		return date;
	}
}
