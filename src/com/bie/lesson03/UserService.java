package com.bie.lesson03;
/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:50:41 
*
*
*/
public class UserService {

	//Ioc,����Ĵ�������Spring���ⲿ������ɡ�
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public void save(){
		userDao.save();
	}
	
}
