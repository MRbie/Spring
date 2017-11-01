package com.bie.lesson01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/** 
* @author  Author:������ 
* @date Date:2017��11��1�� ����9:42:31 
*
*
*/
public class UserTest {

	@Test
	public void test(){
		//�Ӵ��Ժ󣬶���Ĵ�������Spring��Ioc����
		//��һ�������������ļ�
		Resource resource = new ClassPathResource("com/bie/lesson01/bean.xml");
		//�ڶ����������������󣬼�bean������Ioc��������bean������bean.xml
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//���������õ����������Ķ���
		User user = (User) beanFactory.getBean("user");
		System.out.println(user.getId());
	}
	
	@Test
	public void test02(){
		//�Ӵ��Ժ󣬶���Ĵ�������Spring��Ioc����
		//��һ������ȡIoc��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		//�ڶ������������л�ȡbean
		User user = (User) ac.getBean("user");
		System.out.println(user.getId());
	}
}
