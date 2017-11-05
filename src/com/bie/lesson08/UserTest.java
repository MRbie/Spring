package com.bie.lesson08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:06:12 
*
*
*/
public class UserTest {

	ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson08/bean.xml");
 	
	//目标对象有实现接口，Spring会自动选择动态代理，也叫Jdk代理
	@Test
	public void test(){
		UserDao userDao = (UserDao) ac.getBean("userDaoImpl");
		//class com.bie.lesson08.UserDaoImpl
		System.out.println(userDao.getClass());
		//执行业务方法
		userDao.save();
	}
	
	//目标对象没有实现接口，Spring会使用cglib代理。
	@Test
	public void test02(){
		OrderDaoImpl orderDaoImpl = (OrderDaoImpl) ac.getBean("orderDaoImpl");
		//class com.bie.lesson08.UserDaoImpl
		System.out.println(orderDaoImpl.getClass());
		//执行业务方法
		orderDaoImpl.save();
	}
}
