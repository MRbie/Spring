package com.bie.lesson06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 上午10:00:14 
* 给所有的Dao创建代理对象，动态代理
* 代理对象，不需要实现接口
* 
* 1：动态代理，
	1)代理对象，不需要实现接口；
	2)代理对象的生成，是利用JDKAPI， 动态的在内存中构建代理对象(需要我们指定创建 代理对象/目标对象 实现的接口的类型；);
	3)动态代理， JDK代理， 接口代理；

	JDK中生成代理对象的API：
	|-- Proxy
		static Object newProxyInstance(
			ClassLoader loader,       指定当前目标对象使用类加载器
			 Class<?>[] interfaces,     目标对象实现的接口的类型
			InvocationHandler h       事件处理器
		) 
	2:动态代理总结：
		代理对象不需要实现接口，但是目标对象一定要实现接口；否则不能用动态代理！
		(class  $Proxy0  implements UserDao) 
*/
public class ProxyFactory {

	//维护一个目标对象
	private Object target;
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	//给目标对象，生成代理对象
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开启事务");
						
						//执行目标对象方法
						Object invoke = method.invoke(target, args);
						
						System.out.println("提交事务");
						return invoke;
					}
				});
	}
	
	
}
