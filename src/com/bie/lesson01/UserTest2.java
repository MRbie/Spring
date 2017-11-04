package com.bie.lesson01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/** 
* @author  Author:别先生 
* @date Date:2017年11月1日 下午9:42:31 
*
*
*/
public class UserTest2 {


	@Test
	public void test03(){
		//第一步，获取Ioc容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		System.out.println("----------------容器的创建-------------------");
		
		//第二步，从容器中获取bean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		//默认是单例模式
		System.out.println(user);
		System.out.println(user2);
		
	}
	
	@Test
	public void test04(){
		//第一步，获取Ioc容器对象
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		System.out.println("----------------容器的创建-------------------");
		
		//第二步，从容器中获取bean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		//默认是单例模式
		System.out.println(user);
		System.out.println(user2);
		
		//在调用容器对象的销毁方法的时候执行，容器必须使用实现类　　　　　　                                      
		//	 ClassPathXmlApplicationContext，不能使用application接口
		ac.destroy();
	}
}
