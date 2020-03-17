package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 커넥션
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";			
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from userTBL";
			
			if(con != null) {
				//3.PreparedStatement 생성 (sql 문 전송)
				pstmt = con.prepareStatement(sql);
				//4. Query 수행 후 결과 받기
				rs = pstmt.executeQuery(); 
				//5. ResultSet 객체로 부터 데이터추출
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");			//no			
					System.out.print(rs.getString(2)+"\t");			//username	
					System.out.print(rs.getInt(3)+"\t");			//birthyear
					System.out.print(rs.getString(4)+"\t");			//addr
					System.out.println(rs.getString(5)+"\t");		//mobile	
					
				}
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
