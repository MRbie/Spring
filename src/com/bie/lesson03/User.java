package com.bie.lesson03;
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
		System.out.println("user对象的创建！！无参的构造器");
	}
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("user对象的创建，带参的构造器");
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
	
}

