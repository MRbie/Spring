package com.bie.lesson05;
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
		
		//����
		UserDao proxy = new UserDaoProxy(target);
		//ִ�е��ǣ�����ķ���
		proxy.save();
	}
	
	
	
}
