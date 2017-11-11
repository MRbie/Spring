package com.bie.lesson12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:������ 
* @date Date:2017��11��11�� ����4:26:00 
*
*
*/
public class UserTest {

	//��������
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson12/bean.xml");
	
	@Test
	public void test(){
		//�����û�����
		User user = new User();
		user.setUserName("����");
		
		UserService userService = (UserService) ac.getBean("userService");
		userService.save(user);
	}
}
