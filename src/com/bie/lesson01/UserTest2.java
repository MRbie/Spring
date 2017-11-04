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
public class UserTest2 {


	@Test
	public void test03(){
		//��һ������ȡIoc��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		System.out.println("----------------�����Ĵ���-------------------");
		
		//�ڶ������������л�ȡbean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		//Ĭ���ǵ���ģʽ
		System.out.println(user);
		System.out.println(user2);
		
	}
	
	@Test
	public void test04(){
		//��һ������ȡIoc��������
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/bie/lesson01/bean.xml");
		System.out.println("----------------�����Ĵ���-------------------");
		
		//�ڶ������������л�ȡbean
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		
		//Ĭ���ǵ���ģʽ
		System.out.println(user);
		System.out.println(user2);
		
		//�ڵ���������������ٷ�����ʱ��ִ�У���������ʹ��ʵ���ࡡ����������                                      
		//	 ClassPathXmlApplicationContext������ʹ��application�ӿ�
		ac.destroy();
	}
}
