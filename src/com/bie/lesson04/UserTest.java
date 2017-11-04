package com.bie.lesson04;

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
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson04/bean.xml");
		//�ڶ�������ȡ�����еĶ���
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.execute();
	}
	
	
}
