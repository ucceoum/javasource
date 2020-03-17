package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javadb";
			String password = "12345";
			
			
			con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				String sql = "insert into userTBL values(user_seq.nextVal, '송중기', 1980, '서울시 구로구','01012341234')";
				pstmt = con.prepareStatement(sql);
				int result = pstmt.executeUpdate();
				System.out.println(result>0 ? "삽입성공" : "삽입실패");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
