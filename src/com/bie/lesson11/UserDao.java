package com.bie.lesson11;

import org.springframework.jdbc.core.JdbcTemplate;

/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午4:17:54 
*
*
*/
public class UserDao {

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void save(User user){
		String sql = "insert into tb_user(userName) values(?)";
		jdbcTemplate.update(sql, user.getUserName());
 	} 
	
}
