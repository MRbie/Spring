package com.bie.lesson04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:55:28 
*
*
*/
//@Component("userAction") //userAction加入Ioc容器中
//@Component
//@Controller("userAction")
@Controller //代表控制层的组件 
public class UserAction {

	////会从Ioc容器中找userService对象，注入到当前字段，
	/*@Resource(name="userService")
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	
	@Resource
	private UserService userService;//去Ioc容器去找UserService类型的变量，找到后就赋值
	
	
	public String execute(){
		
		userService.save();
		return "success";
	}
}
