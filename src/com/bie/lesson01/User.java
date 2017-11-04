package com.bie.lesson01;
/** 
* @author  Author:别先生 
* @date Date:2017年11月1日 下午9:33:58 
*
*
*/
public class User {

	private int id;
	private String name;

	public User() {
		super();
		System.out.println("user对象的创建！！");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void init_user(){
		System.out.println("user对象创建以后，初始化");
	}
	
	public void destory_user(){
		System.out.println("Ioc容器销毁以后，user对象回收");
	}
}

