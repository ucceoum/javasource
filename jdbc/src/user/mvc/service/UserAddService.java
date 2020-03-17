package user.mvc.service;

import user.mvc.domain.UserVO;
import user.mvc.persistence.UserDAO;
import static user.mvc.persistence.JDBCUtil.*;

import java.sql.Connection;
public class UserAddService {
	
	public boolean addUser(UserVO vo) {
		
		
		//db작업 실시
		Connection con = getConnection();
		
		UserDAO dao = new UserDAO(con);
		
		int insertResult = dao.insert(vo);
		
		boolean insertFlag = false;
		
		if(insertResult > 0) {
			commit(con);
			insertFlag = true;
		}else {
			rollback(con);
		}
		
		
		close(con);
		return insertFlag;
	}
	
	
	
}
