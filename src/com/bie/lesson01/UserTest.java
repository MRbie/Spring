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
public class UserTest {

	@Test
	public void test(){
		//从此以后，对象的创建交给Spring的Ioc容器
		//第一步，加载配置文件
		Resource resource = new ClassPathResource("com/bie/lesson01/bean.xml");
		//第二步，创建容器对象，即bean工厂，Ioc容器等于bean工厂加bean.xml
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//第三步，得到容器创建的对象
		User user = (User) beanFactory.getBean("user");
		System.out.println(user.getId());
	}
	
	@Test
	public void test02(){
		//从此以后，对象的创建交给Spring的Ioc容器
		//第一步，获取Ioc容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		//第二步：从容器中获取bean
		User user = (User) ac.getBean("user");
		System.out.println(user.getId());
	}
}
