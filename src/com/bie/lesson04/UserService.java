package com.bie.lesson04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:50:41 
*
*
*/
//@Component("userService") //userService加入Ioc容器中
@Service("userService")
public class UserService {

	//会从Ioc容器中找userDao对象，注入到当前字段，
	@Resource(name="userDao")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public void save(){
		userDao.save();
	}
	
}
