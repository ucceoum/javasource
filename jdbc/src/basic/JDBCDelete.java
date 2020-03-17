package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDelete {

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
				String sql = "delete from userTBL where no = 2";
				pstmt = con.prepareStatement(sql);
				int result = pstmt.executeUpdate();
				System.out.println(result>0 ? result+"성공" : "실패");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
