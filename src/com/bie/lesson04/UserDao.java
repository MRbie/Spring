package com.bie.lesson04;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** 
* @author  Author:������ 
* @date Date:2017��11��4�� ����4:50:34 
*
*
*/
//@Component("userDao") //userDao����Ioc������
//@Component
//@Repository("userDao")
@Repository  //�ڳ־ò����ʹ�����ע��
public class UserDao {

	public void save(){
		System.out.println("���ݿ⣺�����û�");
	}
}
