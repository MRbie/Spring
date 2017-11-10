package com.bie.lesson09;

import org.aspectj.lang.ProceedingJoinPoint;

/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����5:26:02 
*
* ָ���������ʽ��������Щ��������Ϊ��Щ�����ɴ������
*/
public class Aop {

	
	
	public void begin(){
		System.out.println("��������/�쳣");
	}
	
	public void after(){
		System.out.println("�ύ����");
	}
	
	public void afterReturn(){
		System.out.println("���غ�֪ͨ�� �ڵ���Ŀ�귽��������ִ�� �������쳣��ִ�С�");
	}
	
	public void afterThrow(){
		System.out.println("�쳣֪ͨ�� ��Ŀ�귽��ִ���쳣ʱ��ִ�д˹�ע�����");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����ǰ....");
		pjp.proceed();  // ִ��Ŀ�귽��
		System.out.println("���ƺ�....");
	}
	
}
