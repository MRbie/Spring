package com.bie.lesson08;

import org.springframework.stereotype.Component;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午9:55:15 
* 
*/
@Component //Ioc控制反转
public class OrderDaoImpl {

	public void save() {
		System.out.println("数据库:保存数据");
	}

}
