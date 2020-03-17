package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) {
		
		//JDBC 순서
		Connection con = null;
		try {
			//1. 드라이버로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 커넥션 생성
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javadb";
			String password = "12345";
			con = DriverManager.getConnection(url,user,password);
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
