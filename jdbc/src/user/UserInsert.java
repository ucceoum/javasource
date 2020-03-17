package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				String sql = "insert into usertbl values(user_seq.nextVal,?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "정우성");
				pstmt.setInt(2, 1970);
				pstmt.setString(3, "서울시 구로구");
				pstmt.setString(4, "01065478965");
				
				int result = pstmt.executeUpdate();
				System.out.println(result>0 ? "삽입 성공" : "삽입 실패");
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
