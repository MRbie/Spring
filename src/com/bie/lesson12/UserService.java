package com.bie.lesson12;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午4:18:28 
*
*
*/
@Service
public class UserService {

	//容器注入的dao
	@Resource
	private UserDao userDao;
	
	//事务控制？
	@Transactional(
			readOnly = false,  // 读写事务
			timeout = -1,       // 事务的超时时间不限制
			//noRollbackFor = ArithmeticException.class,  // 遇到数学异常不回滚
			isolation = Isolation.DEFAULT,              // 事务的隔离级别，数据库的默认
			propagation = Propagation.REQUIRED			// 事务的传播行为
	)
	public void save(User user){
		//第一次调用
		userDao.save(user);
		
		int a = 1/0;
		
		//第二次调用
		userDao.save(user);
	}
	
}
