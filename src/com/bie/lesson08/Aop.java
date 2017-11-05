package com.bie.lesson08;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** 
* @author  Author:别先生 
* @date Date:2017年11月5日 下午5:26:02 
*
* 指定切入点表达式，拦截那些方法，即为那些类生成代理对象。
*/
@Component
@Aspect //指定当前类为切面类
public class Aop {

	//重复执行的代码
	//指定切入点表达式，拦截那些方法，即为那些类生成代理对象。
	//第一个*，方法返回值。
	//第二个*，该类的所有方法
	//两个点，代表所有参数
	/*@Before("execution(* com.bie.lesson08.UserDaoImpl.*(..))")
	public void begin(){
		System.out.println("开启事务/异常");
	}*/
	
	//业务方法执行后执行的方法
	/*@After("execution(* com.bie.lesson08.UserDaoImpl.*(..))")
	public void commit(){
		System.out.println("提交事务");
	}*/
	
	@Pointcut("execution(* com.bie.lesson08.*.*(..))")
	public void ponitCut(){}

	// 前置通知 : 在执行目标方法之前执行
	@Before("ponitCut()")
	public void begin(){
		System.out.println("开启事务/异常");
	}
	
	// 后置,最终通知：在执行目标方法之后执行  【无论是否出现异常最终都会执行】
	@After("ponitCut()")
	public void commit(){
		System.out.println("提交事务");
	}
	
	// 返回后通知： 在调用目标方法结束后执行 【出现异常不执行】
	@AfterReturning("ponitCut()")
	public void afterReturn(){
		System.out.println("返回后通知： 在调用目标方法结束后执行 【出现异常不执行】");
	}
	
	// 异常通知： 当目标方法执行异常时候执行此关注点代码
	@AfterThrowing("ponitCut()")
	public void afterThrow(){
		System.out.println("异常通知： 当目标方法执行异常时候执行此关注点代码");
	}
	
	// 环绕通知：环绕目标方式执行
	@Around("ponitCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕前....");
		pjp.proceed();  // 执行目标方法
		System.out.println("环绕后....");
	}
	
}
