package com.zhongchongjia.test;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhongchongjia.until.DateUtil;
import com.zhongchongjia.until.RandNumUtil;
import com.zhongchongjia.until.ZHStringUtil;

public class TPSTest {

	@Test
	public void test() {
		
		for (Integer i =1; i <=100; i++) {
			//id,sail
			BigInteger id=BigInteger.valueOf(i);
			BigDecimal sail=BigDecimal.valueOf(RandNumUtil.getValue(30000,80000,2));
			//创建对象
			TPS tps=new TPS();
			//赋值
			tps.setId(id);
			tps.setName(ZHStringUtil.getZHName());
			tps.setSail(sail);
			tps.setAge(RandNumUtil.random(1,100));
			//时间
			Calendar calendar=Calendar.getInstance();
			calendar.set(2012,1,1);
			tps.setTime(DateUtil.randomTime(calendar.getTime(),new Date()));
			//打印
			System.out.println(tps);
		}
		
	}

}
