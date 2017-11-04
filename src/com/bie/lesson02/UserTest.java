package com.bie.lesson02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author  Author:别先生 
* @date Date:2017年11月1日 下午9:42:31 
*
*
*/
public class UserTest {

	@Test
	public void test(){
		//第一步，ioc容器的创建
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson02/bean.xml");
		//第二步，获取容器中的对象
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
