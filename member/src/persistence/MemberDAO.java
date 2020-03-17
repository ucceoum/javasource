package persistence;

import domain.MemberVO;
import static persistence.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class MemberDAO {

	//로그인 : select userid, name from member where userid=? and password=?;
	public MemberVO isLogin(String userid, String password) {
		
		String sql = "select userid, name from member where userid=? and password=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserid(rs.getString(1));
				vo.setName(rs.getString(2));
				
				return vo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	//회원삭제
	//delete from member where userid=? and password=?
	public int leave(String userid, String password) {
		int result = 0;
		
		
		String sql = "delete from member where userid=? and password=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			result = pstmt.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int memberUpdate(String userid, String new_password) {
		int result= 0;
		String sql = "update member set password=? where userid=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, new_password);
			pstmt.setString(2, userid);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	//회원가입		
	//insert
	public int joinMember(MemberVO vo) {
		int result = 0;
		String sql = "insert into member(userid, password, name, gender, email) values(?,?,?,?,?)";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getEmail());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
