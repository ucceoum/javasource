package user.mvc.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static user.dao.util.JDBCUtil.*;

import oracle.jdbc.proxy.annotation.Pre;
import user.mvc.domain.UserVO;

public class UserDAO {
	//Connection, selectAll, selectOne, insert, update, delete
	//작업 수행
	
	private Connection con;
	
	
	
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}



	//selectAll
	public List<UserVO> selectAll() {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from userTBL";
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt(1));
				vo.setUserName(rs.getString(2));
				vo.setBirthYear(rs.getInt(3));
				vo.setAddr(rs.getString(4));
				vo.setMobile(rs.getString(5));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	
	//selectOne
	public UserVO selectOne(int no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO vo = null;
		String sql = "select * from userTBL where no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//rs에 있는 값을 가져다가 vo 객체에 담기
				vo = new UserVO();
				vo.setNo(rs.getInt(1));
				vo.setUserName(rs.getString(2));
				vo.setBirthYear(rs.getInt(3));
				vo.setAddr(rs.getString(4));
				vo.setMobile(rs.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
		
		
	}
	
	
	//update
	public boolean update(UserVO vo) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update userTBL set addr =  ?,　mobile = ? where no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getAddr());
			pstmt.setString(2, vo.getMobile());
			pstmt.setInt(3, vo.getNo());
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	
	//delete
	public int delete(int no) {
		int result=0;
		PreparedStatement pstmt = null;
		String sql = "delete from userTBL where no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
			if(result>0) {
				commit(con);
			}else {
				rollback(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	//insert
	public int insert(UserVO vo) {
		PreparedStatement pstmt = null;
		int result=0;
		String sql = "insert into userTBL values(user_seq.nextVal,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserName());
			pstmt.setInt(2, vo.getBirthYear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
}
