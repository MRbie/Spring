package com.bie.lesson05;
/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:00:14 
*
* 1：代理对象：代理模式的关键点： 代理对象与目标对象。
* 	静态代理：代理对象，要实现与目标对象一样的接口；
* 2：总结静态代理：
	1）可以做到在不修改目标对象的功能前提下，对目标对象功能扩展。
	2）缺点：
		==》  因为代理对象，需要与目标对象实现一样的接口。所以会有很多代理类，类太多。
		==》  一旦接口增加方法，目标对象与代理对象都要维护。
	解决：
		代理工厂？  可以使用动态代理。
*/
public class UserDaoProxy implements UserDao{

	//接受保存目标对象
	private UserDao target;
	public UserDaoProxy(UserDao target) {
		this.target = target;
	}
	
	@Override
	public void save() {
		System.out.println("开启事务");
		
		//执行目标方法
		target.save();
		
		System.out.println("提交事务");
		
	}

}
