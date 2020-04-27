package com.zhongchongjia.until;

import java.util.Date;
/**
 * 时间工具类
 * @author zhongchongjia
 *
 */
public class DateUtil {
	public static Date randomTime(Date time1,Date time2) {
		long start=time1.getTime();
		long end=time2.getTime();
		long time=(long) (Math.random()*(end-start)+start);
		return new Date(time);
	}
}
