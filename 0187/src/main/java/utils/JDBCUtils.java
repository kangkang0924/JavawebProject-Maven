package utils;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ����cp30��ȡ����
 * JDBC�Ĺ�����
 * @author jt
 *
 */
public class JDBCUtils {
	// ����һ�����ӳأ�����������ӳ�ֻ��Ҫ����һ�μ��ɡ�  
	//�������ӳ�Ĭ��ȥ��·���²���c3p0-config.xml
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/**
	 * ������ӵķ���
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * ������ӳ�:
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}

