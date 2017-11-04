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
//@Component
//@Service("userService")
@Service //代表业务逻辑层的组件
public class UserService {

	//会从Ioc容器中找userDao对象，注入到当前字段，
	/*@Resource(name="userDao")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	
	@Resource
	private UserDao userDao;//去Ioc容器去找UserDao类型的变量，找到后就赋值
	
	
	public void save(){
		userDao.save();
	}
	
}
