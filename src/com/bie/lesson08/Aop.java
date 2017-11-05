package com.bie.lesson08;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����5:26:02 
*
* ָ���������ʽ��������Щ��������Ϊ��Щ�����ɴ������
*/
@Component
@Aspect //ָ����ǰ��Ϊ������
public class Aop {

	//�ظ�ִ�еĴ���
	//ָ���������ʽ��������Щ��������Ϊ��Щ�����ɴ������
	//��һ��*����������ֵ��
	//�ڶ���*����������з���
	//�����㣬�������в���
	/*@Before("execution(* com.bie.lesson08.UserDaoImpl.*(..))")
	public void begin(){
		System.out.println("��������/�쳣");
	}*/
	
	//ҵ�񷽷�ִ�к�ִ�еķ���
	/*@After("execution(* com.bie.lesson08.UserDaoImpl.*(..))")
	public void commit(){
		System.out.println("�ύ����");
	}*/
	
	@Pointcut("execution(* com.bie.lesson08.*.*(..))")
	public void ponitCut(){}

	// ǰ��֪ͨ : ��ִ��Ŀ�귽��֮ǰִ��
	@Before("ponitCut()")
	public void begin(){
		System.out.println("��������/�쳣");
	}
	
	// ����,����֪ͨ����ִ��Ŀ�귽��֮��ִ��  �������Ƿ�����쳣���ն���ִ�С�
	@After("ponitCut()")
	public void commit(){
		System.out.println("�ύ����");
	}
	
	// ���غ�֪ͨ�� �ڵ���Ŀ�귽��������ִ�� �������쳣��ִ�С�
	@AfterReturning("ponitCut()")
	public void afterReturn(){
		System.out.println("���غ�֪ͨ�� �ڵ���Ŀ�귽��������ִ�� �������쳣��ִ�С�");
	}
	
	// �쳣֪ͨ�� ��Ŀ�귽��ִ���쳣ʱ��ִ�д˹�ע�����
	@AfterThrowing("ponitCut()")
	public void afterThrow(){
		System.out.println("�쳣֪ͨ�� ��Ŀ�귽��ִ���쳣ʱ��ִ�д˹�ע�����");
	}
	
	// ����֪ͨ������Ŀ�귽ʽִ��
	@Around("ponitCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����ǰ....");
		pjp.proceed();  // ִ��Ŀ�귽��
		System.out.println("���ƺ�....");
	}
	
}
