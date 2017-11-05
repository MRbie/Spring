package com.bie.lesson08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����10:06:12 
*
*
*/
public class UserTest {

	ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson08/bean.xml");
 	
	//Ŀ�������ʵ�ֽӿڣ�Spring���Զ�ѡ��̬����Ҳ��Jdk����
	@Test
	public void test(){
		UserDao userDao = (UserDao) ac.getBean("userDaoImpl");
		//class com.bie.lesson08.UserDaoImpl
		System.out.println(userDao.getClass());
		//ִ��ҵ�񷽷�
		userDao.save();
	}
	
	//Ŀ�����û��ʵ�ֽӿڣ�Spring��ʹ��cglib����
	@Test
	public void test02(){
		OrderDaoImpl orderDaoImpl = (OrderDaoImpl) ac.getBean("orderDaoImpl");
		//class com.bie.lesson08.UserDaoImpl
		System.out.println(orderDaoImpl.getClass());
		//ִ��ҵ�񷽷�
		orderDaoImpl.save();
	}
}
