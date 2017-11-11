package com.bie.lesson12;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/** 
* @author  Author:������ 
* @date Date:2017��11��11�� ����4:18:28 
*
*
*/
@Service
public class UserService {

	//����ע���dao
	@Resource
	private UserDao userDao;
	
	//������ƣ�
	@Transactional(
			readOnly = false,  // ��д����
			timeout = -1,       // ����ĳ�ʱʱ�䲻����
			//noRollbackFor = ArithmeticException.class,  // ������ѧ�쳣���ع�
			isolation = Isolation.DEFAULT,              // ����ĸ��뼶�����ݿ��Ĭ��
			propagation = Propagation.REQUIRED			// ����Ĵ�����Ϊ
	)
	public void save(User user){
		//��һ�ε���
		userDao.save(user);
		
		int a = 1/0;
		
		//�ڶ��ε���
		userDao.save(user);
	}
	
}
