package com.bie.lesson11;
/** 
* @author  Author:������ 
* @date Date:2017��11��11�� ����4:18:28 
*
*
*/
public class UserService {

	//����ע���dao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save(User user){
		//��һ�ε���
		userDao.save(user);
		
		//int a = 1/0;
		
		//�ڶ��ε���
		userDao.save(user);
	}
	
}
