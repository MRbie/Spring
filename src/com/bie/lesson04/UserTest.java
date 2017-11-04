package com.bie.lesson04;

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
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson04/bean.xml");
		//第二步，获取容器中的对象
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.execute();
	}
	
	
}
