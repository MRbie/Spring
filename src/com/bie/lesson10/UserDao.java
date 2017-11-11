package com.bie.lesson10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


/** 
* @author  Author:别先生 
* @date Date:2017年11月11日 下午2:52:24 
*
*
*/
public class UserDao {

	//注入到容器中，控制反转
	/*private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}*/
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//保存的方法
	//需要优化的地方
	//1:连接管理。
	//2:jdbc操作重复代码的封装。
	/*public void save(){
		try {
			String sql = "insert into tb_user(userName) values('张三') ";
			Connection conn = null;
			PreparedStatement ps = null;
			Class.forName("com.mysql.jdbc.Driver");
			//连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "123456");
			//执行命令对象
			ps = conn.prepareStatement(sql);
			//执行
			ps.execute();
			//关闭
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*@Test
	public void save02(){
		try {
			String sql = "insert into tb_user(userName) values('张三') ";
			Connection conn = null;
			PreparedStatement ps = null;
			//连接对象
			conn = dataSource.getConnection();
			//执行命令对象
			ps = conn.prepareStatement(sql);
			//执行
			ps.execute();
			//关闭
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	@Test
	public void save03(){
		try {
			String sql = "insert into tb_user(userName) values('张三') ";
			//使用jdbc模板工具类简化jdbc操作
			//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
