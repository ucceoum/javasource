package dao;
import static dao.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.UserVO;
public class UserDAO {
	//회원가입 => insert => int
	public int insertUser(UserVO vo) {
		int result = 0;

		
		String sql = "insert into userTBL(no, username, birthyear, addr, mobile) ";
		sql += "values(user_seq.nextVal,?,?,?,?)";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			// ? 작업
			pstmt.setString(1, vo.getUserName());
			pstmt.setInt(2, vo.getBirthYear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	//select => userTBL => select * from userTBL;
	public ArrayList<UserVO> getList(){
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from userTBL");){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt(1));
				vo.setUserName(rs.getString(2));
				vo.setMobile(rs.getString(5));
				list.add(vo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	//삭제 delete from userTBL where no=? and userName=?
	public int deleteUser(int no, String userName) {
		int result = 0;
		String sql = "delete from userTBL where no=? and userName=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
			//? 해결
			pstmt.setInt(1, no);
			pstmt.setString(2, userName);
			result = pstmt.executeUpdate();	
		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	
	
	//조회 select * from userTBL where no = ?;
	
	public UserVO getRow(int no) {
		String sql = "select * from userTBL where no = ?";
		
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				no = rs.getInt(1);
				String userName = rs.getString(2);
				int birthYear = rs.getInt(3);
				String addr = rs.getString(4);
				String mobile = rs.getString(5);
				return new UserVO(no, userName, birthYear, addr, mobile);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//수정 update userTBL set addr=?, mobile=? where no=?
	
	public int updateUser(UserVO vo) {
		int result = 0;
		
		String sql = "update userTBL set addr=?, mobile=? where no=?";
		try (Connection con=getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, vo.getAddr());
			pstmt.setString(2, vo.getMobile());
			pstmt.setInt(3, vo.getNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	
	
}
