package com.bie.lesson03;
/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:55:28 
*
*
*/
public class UserAction {

	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute(){
		
		userService.save();
		return "success";
	}
}
