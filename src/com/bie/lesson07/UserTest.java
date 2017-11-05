package com.bie.lesson07;
/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����10:06:12 
*
*
*/
public class UserTest {

	//Cglib����
	public static void main(String[] args) {
		//Ŀ�����
		UserDao target = new UserDaoImpl();
		//class com.bie.lesson07.UserDaoImpl
		System.out.println(target.getClass());
		
		//�������
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		//class com.bie.lesson07.UserDaoImpl$$EnhancerByCGLIB$$3d03ffb7
		System.out.println(proxy.getClass());
		
		//ִ�д������ķ���
		proxy.save();
	}
	
	
	
}
