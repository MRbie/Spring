package com.bie.lesson10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


/** 
* @author  Author:������ 
* @date Date:2017��11��11�� ����2:52:24 
*
*
*/
public class UserDao {

	//ע�뵽�����У����Ʒ�ת
	/*private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}*/
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//����ķ���
	//��Ҫ�Ż��ĵط�
	//1:���ӹ���
	//2:jdbc�����ظ�����ķ�װ��
	/*public void save(){
		try {
			String sql = "insert into tb_user(userName) values('����') ";
			Connection conn = null;
			PreparedStatement ps = null;
			Class.forName("com.mysql.jdbc.Driver");
			//���Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "123456");
			//ִ���������
			ps = conn.prepareStatement(sql);
			//ִ��
			ps.execute();
			//�ر�
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
			String sql = "insert into tb_user(userName) values('����') ";
			Connection conn = null;
			PreparedStatement ps = null;
			//���Ӷ���
			conn = dataSource.getConnection();
			//ִ���������
			ps = conn.prepareStatement(sql);
			//ִ��
			ps.execute();
			//�ر�
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
			String sql = "insert into tb_user(userName) values('����') ";
			//ʹ��jdbcģ�幤�����jdbc����
			//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
