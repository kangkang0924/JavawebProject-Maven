package model;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Exam;
import domain.User;
import utils.JDBCUtils;

public class ExamModel {

	//��ѯ����ѧ���ɼ���Ϣ�ķ���
	private  boolean flag = false;
	public User login(User user) throws SQLException {
		// �������ݿ⣺ͨ��������û���������ȥ���ݿ��н��в�ѯ
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		User existUser = queryRunner.query("select * from user where username =? and password =?",
				new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
		return existUser;
	}
	
	
	
	public List<Exam> QueryAllNum() throws SQLException{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<Exam> list = queryRunner.query("select * from exam", new BeanListHandler<Exam>(Exam.class));
		return list;
		
	}

}
