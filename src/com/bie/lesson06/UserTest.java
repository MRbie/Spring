package com.bie.lesson06;
/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����10:06:12 
*
*
*/
public class UserTest {

	//��̬����
	public static void main(String[] args) {
		//Ŀ�����
		UserDao target = new UserDaoImpl();
		//class com.bie.lesson06.UserDaoImpl
		System.out.println(target.getClass());
		
		//��Ŀ����󡣴����������
		//û��ʹ�÷��ͣ�����ʹ��ǿ������ת��
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		
		//class com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass());
		
		//ִ�з������������
		proxy.save();
	}
	
	
	
}
