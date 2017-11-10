package com.bie.lesson09;

import org.aspectj.lang.ProceedingJoinPoint;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 下午5:26:02 
*
* 指定切入点表达式，拦截那些方法，即为那些类生成代理对象。
*/
public class Aop {

	
	
	public void begin(){
		System.out.println("开启事务/异常");
	}
	
	public void after(){
		System.out.println("提交事务");
	}
	
	public void afterReturn(){
		System.out.println("返回后通知： 在调用目标方法结束后执行 【出现异常不执行】");
	}
	
	public void afterThrow(){
		System.out.println("异常通知： 当目标方法执行异常时候执行此关注点代码");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕前....");
		pjp.proceed();  // 执行目标方法
		System.out.println("环绕后....");
	}
	
}
