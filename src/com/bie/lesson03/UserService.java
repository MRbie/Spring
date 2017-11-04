package com.bie.lesson03;
/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:50:41 
*
*
*/
public class UserService {

	//Ioc,对象的创建交给Spring的外部容器完成。
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public void save(){
		userDao.save();
	}
	
}
