package com.bie.lesson04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:55:28 
*
*
*/
//@Component("userAction") //userAction����Ioc������
//@Component
//@Controller("userAction")
@Controller //�������Ʋ����� 
public class UserAction {

	////���Ioc��������userService����ע�뵽��ǰ�ֶΣ�
	/*@Resource(name="userService")
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	
	@Resource
	private UserService userService;//ȥIoc����ȥ��UserService���͵ı������ҵ���͸�ֵ
	
	
	public String execute(){
		
		userService.save();
		return "success";
	}
}