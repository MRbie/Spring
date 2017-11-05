package com.bie.lesson06;
/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午9:55:15 
*
* 1：代理（Proxy）是一种设计模式， 
* 	提供了对目标对象另外的访问方式；即通过代理访问目标对象。 
* 	这样好处：
* 		 可以在目标对象实现的基础上，增强额外的功能操作。
* 		(扩展目标对象的功能)。
* 
*/
public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("数据库:保存数据");
	}

}
