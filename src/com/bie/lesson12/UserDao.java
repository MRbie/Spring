package com.bie.lesson12;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午4:17:54 
*
*
*/
@Repository
public class UserDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user){
		String sql = "insert into tb_user(userName) values(?)";
		jdbcTemplate.update(sql, user.getUserName());
 	} 
	
}
