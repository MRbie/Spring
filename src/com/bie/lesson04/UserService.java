package com.bie.lesson04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:50:41 
*
*
*/
//@Component("userService") //userService����Ioc������
//@Component
//@Service("userService")
@Service //����ҵ���߼�������
public class UserService {

	//���Ioc��������userDao����ע�뵽��ǰ�ֶΣ�
	/*@Resource(name="userDao")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	
	@Resource
	private UserDao userDao;//ȥIoc����ȥ��UserDao���͵ı������ҵ���͸�ֵ
	
	
	public void save(){
		userDao.save();
	}
	
}