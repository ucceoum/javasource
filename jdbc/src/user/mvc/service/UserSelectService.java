package user.mvc.service;

import java.sql.Connection;

import static user.mvc.persistence.JDBCUtil.*;

import user.mvc.domain.UserVO;
import user.mvc.persistence.UserDAO;

public class UserSelectService {
	
	
	public UserVO selectOne(int no){
		
		Connection con = getConnection(); 
		
		UserDAO dao = new UserDAO(con);
		UserVO vo = dao.selectOne(no);
		close(con);
		return vo;
	}
}
