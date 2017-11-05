package com.bie.lesson05;
/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:06:12 
*
*
*/
public class UserTest {

	//静态代理
	public static void main(String[] args) {
		//目标对象
		UserDao target = new UserDaoImpl();
		
		//代理
		UserDao proxy = new UserDaoProxy(target);
		//执行的是，代理的方法
		proxy.save();
	}
	
	
	
}
