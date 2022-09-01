import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC�Ĺ�����
 * 
 * ��ͳ������ȡ����
 * 
 * @author jt
 *
 */
public class JDBCUtils {
	private static final String driverClassName;
	private static final String url;
	private static final String username;
	private static final String password;
	
	static{
		driverClassName="com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/testconnection?useUnicode=true&characterEncoding=utf-8";
		username = "root";
		password = "123456";
	}

	/**
	 * ע�������ķ���
	 */
	public static void loadDriver(){
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ������ӵķ���
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try{
			// ������һ��ע��:
			loadDriver();
			// �������
			conn = DriverManager.getConnection(url,username, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ͷ���Դ�ķ���
	 */
	public static void release(Statement stmt,Connection conn){
		if(stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			stmt = null;
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	public static void release(ResultSet rs,Statement stmt,Connection conn){
		// ��Դ�ͷţ�
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			rs = null;
		}
		if(stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			stmt = null;
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
}
