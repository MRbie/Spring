package com.bie.lesson03;
/** 
* @author  Author:������ 
* @date Date:2017��11��1�� ����9:33:58 
*
*
*/
public class User {

	private int id;
	private String name;

	public User() {
		super();
		System.out.println("user����Ĵ��������޲εĹ�����");
	}
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("user����Ĵ��������εĹ�����");
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

