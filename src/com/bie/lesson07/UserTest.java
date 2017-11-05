package com.bie.lesson07;
/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:06:12 
*
*
*/
public class UserTest {

	//Cglib代理
	public static void main(String[] args) {
		//目标对象
		UserDao target = new UserDaoImpl();
		//class com.bie.lesson07.UserDaoImpl
		System.out.println(target.getClass());
		
		//代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		//class com.bie.lesson07.UserDaoImpl$$EnhancerByCGLIB$$3d03ffb7
		System.out.println(proxy.getClass());
		
		//执行代理对象的方法
		proxy.save();
	}
	
	
	
}
