package com.bie.lesson02;
/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:22:54 
*
* ��������������
*/
public class FactoryUser {

	//ʵ��������������
	public User getInstance(){
		return new User(1008611,"����������ʵ������");
	}
	
	//ʵ��������������
	public static User getStaticInstance(){
		return new User(1008612,"���������þ�̬����");
	}
}
