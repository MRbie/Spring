package com.bie.lesson07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:00:14 
* 
* Cglib代理，也叫做子类代理。在内存中构建一个子类对象从而实现对目标对象功能的扩展。
* 
* Cglib子类代理：
	1) 需要引入cglib – jar文件， 但是spring的核心包中已经包括了cglib功能，所以直接引入spring-core-3.2.5.jar即可。
	2）引入功能包后，就可以在内存中动态构建子类
	3）代理的类不能为final， 否则报错。
	4） 目标对象的方法如果为final/static, 那么就不会被拦截，即不会执行目标对象额外的业务方法。

    在Spring的AOP编程中，
	如果加入容器的目标对象有实现接口，用JDK代理；
	如果目标对象没有实现接口，用Cglib代理；
 
  Cglib子类代理工厂：
  	对UserDao在内存中动态构建一个子类对象。
*/
public class ProxyFactory implements MethodInterceptor{

	//维护目标对象
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;	
	}
	
	//给目标对象创建代理对象
	public Object getProxyInstance(){
		//1:工具类
		Enhancer en = new Enhancer();
		//2:设置父类
		en.setSuperclass(target.getClass());
		//3:设置回掉函数
		en.setCallback(this);
		//4:创建子类
		return en.create();
	}
	
	@Override
	public Object intercept(Object object, Method method, 
			Object[] objects, MethodProxy proxy) throws Throwable {
		System.out.println("开启事务");
		
		//执行目标对象的方法
		Object invoke = method.invoke(target, objects);
		
		System.out.println("提交事务");
		return invoke;
	}
	
}
