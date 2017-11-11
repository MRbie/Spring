package com.bie.lesson10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午2:52:16 
*
*
*/
public class JdbcTest {

	ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson10/bean.xml");
	
	@Test
	public void test(){
		UserDao userDao = (UserDao) ac.getBean("userDao");
		//userDao.save();
		//userDao.save02();
		userDao.save03();
	}
	
	
	
	
}
