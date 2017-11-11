package com.bie.lesson11;
/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午4:18:28 
*
*
*/
public class UserService {

	//容器注入的dao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save(User user){
		//第一次调用
		userDao.save(user);
		
		//int a = 1/0;
		
		//第二次调用
		userDao.save(user);
	}
	
}
