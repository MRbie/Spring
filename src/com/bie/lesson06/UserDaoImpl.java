package com.bie.lesson06;
/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����9:55:15 
*
* 1������Proxy����һ�����ģʽ�� 
* 	�ṩ�˶�Ŀ���������ķ��ʷ�ʽ����ͨ���������Ŀ����� 
* 	�����ô���
* 		 ������Ŀ�����ʵ�ֵĻ����ϣ���ǿ����Ĺ��ܲ�����
* 		(��չĿ�����Ĺ���)��
* 
*/
public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("���ݿ�:��������");
	}

}
