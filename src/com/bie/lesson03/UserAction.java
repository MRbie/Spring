package com.bie.lesson03;
/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:55:28 
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
