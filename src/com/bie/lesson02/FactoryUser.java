package com.bie.lesson02;
/** 
* @author  Author:别先生 
* @date Date:2017年11月4日 下午4:22:54 
*
* 工厂，创建对象。
*/
public class FactoryUser {

	//实例方法创建对象。
	public User getInstance(){
		return new User(1008611,"工厂：调用实例方法");
	}
	
	//实例方法创建对象。
	public static User getStaticInstance(){
		return new User(1008612,"工厂：调用静态方法");
	}
}
