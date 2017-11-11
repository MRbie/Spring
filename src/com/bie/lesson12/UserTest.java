package com.bie.lesson12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午4:26:00 
*
*
*/
public class UserTest {

	//创建容器
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson12/bean.xml");
	
	@Test
	public void test(){
		//设置用户数据
		User user = new User();
		user.setUserName("李四");
		
		UserService userService = (UserService) ac.getBean("userService");
		userService.save(user);
	}
}
