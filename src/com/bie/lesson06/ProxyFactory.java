package com.bie.lesson06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
* @author  Author:������ 
* @date Date:2017��11��5�� ����10:00:14 
* �����е�Dao����������󣬶�̬����
* ������󣬲���Ҫʵ�ֽӿ�
* 
* 1����̬����
	1)������󣬲���Ҫʵ�ֽӿڣ�
	2)�����������ɣ�������JDKAPI�� ��̬�����ڴ��й����������(��Ҫ����ָ������ �������/Ŀ����� ʵ�ֵĽӿڵ����ͣ�);
	3)��̬���� JDK���� �ӿڴ���

	JDK�����ɴ�������API��
	|-- Proxy
		static Object newProxyInstance(
			ClassLoader loader,       ָ����ǰĿ�����ʹ���������
			 Class<?>[] interfaces,     Ŀ�����ʵ�ֵĽӿڵ�����
			InvocationHandler h       �¼�������
		) 
	2:��̬�����ܽ᣺
		���������Ҫʵ�ֽӿڣ�����Ŀ�����һ��Ҫʵ�ֽӿڣ��������ö�̬����
		(class  $Proxy0  implements UserDao) 
*/
public class ProxyFactory {

	//ά��һ��Ŀ�����
	private Object target;
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	//��Ŀ��������ɴ������
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("��������");
						
						//ִ��Ŀ����󷽷�
						Object invoke = method.invoke(target, args);
						
						System.out.println("�ύ����");
						return invoke;
					}
				});
	}
	
	
}
