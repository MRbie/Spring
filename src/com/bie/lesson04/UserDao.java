package com.bie.lesson04;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:50:34 
*
*
*/
//@Component("userDao") //userDao加入Ioc容器中
//@Component
//@Repository("userDao")
@Repository  //在持久层可以使用这个注解
public class UserDao {

	public void save(){
		System.out.println("数据库：保存用户");
	}
}
