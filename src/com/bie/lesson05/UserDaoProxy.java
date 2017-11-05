package com.bie.lesson05;
/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����10:00:14 
*
* 1��������󣺴���ģʽ�Ĺؼ��㣺 ���������Ŀ�����
* 	��̬�����������Ҫʵ����Ŀ�����һ���Ľӿڣ�
* 2���ܽᾲ̬����
	1�����������ڲ��޸�Ŀ�����Ĺ���ǰ���£���Ŀ���������չ��
	2��ȱ�㣺
		==��  ��Ϊ���������Ҫ��Ŀ�����ʵ��һ���Ľӿڡ����Ի��кܶ�����࣬��̫�ࡣ
		==��  һ���ӿ����ӷ�����Ŀ�������������Ҫά����
	�����
		��������  ����ʹ�ö�̬����
*/
public class UserDaoProxy implements UserDao{

	//���ܱ���Ŀ�����
	private UserDao target;
	public UserDaoProxy(UserDao target) {
		this.target = target;
	}
	
	@Override
	public void save() {
		System.out.println("��������");
		
		//ִ��Ŀ�귽��
		target.save();
		
		System.out.println("�ύ����");
		
	}

}
