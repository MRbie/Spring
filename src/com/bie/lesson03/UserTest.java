package com.bie.lesson03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:������ 
* @date Date:2017��11��1�� ����9:42:31 
*
*
*/
public class UserTest {

	@Test
	public void test(){
		//��һ����ioc�����Ĵ���
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson03/bean.xml");
		//�ڶ�������ȡ�����еĶ���
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void test02(){
		//��һ����ioc�����Ĵ���
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson03/bean.xml");
		//�ڶ�������ȡ�����еĶ���
		UserAction userAction = (UserAction) ac.getBean("userAction");
		
		userAction.execute();
	}
	
	@Test
	public void test03(){
		//��һ����ioc�����Ĵ���
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson03/bean.xml");
		//�ڶ�������ȡ�����еĶ���
		UserAction userAction = (UserAction) ac.getBean("userAction");
		
		userAction.execute();
	}
	
	@Test
	public void test04(){
		//��һ����ioc�����Ĵ���
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson03/bean.xml");
		//�ڶ�������ȡ�����еĶ���
		UserAction userAction = (UserAction) ac.getBean("userAction");
		
		userAction.execute();
	}
}
