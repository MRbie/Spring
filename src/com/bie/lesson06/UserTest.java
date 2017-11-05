package com.bie.lesson06;
/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:06:12 
*
*
*/
public class UserTest {

	//动态代理
	public static void main(String[] args) {
		//目标对象
		UserDao target = new UserDaoImpl();
		//class com.bie.lesson06.UserDaoImpl
		System.out.println(target.getClass());
		
		//给目标对象。创建代理对象，
		//没有使用泛型，所以使用强制类型转换
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		
		//class com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass());
		
		//执行方法，代理对象
		proxy.save();
	}
	
	
	
}
