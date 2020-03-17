package user.dao;

import java.util.ArrayList;
import java.util.List;

public class UserMain {

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		
		//selectOne
		UserVO vo = dao.selectOne(7);
		if(vo != null) {
			System.out.println(vo);
		}else {
			System.out.println("User No를 확인해 주세요");
		}
		
		//List
		System.out.println("all");
		List<UserVO> list = dao.selectAll();
		for(UserVO i : list) {
			System.out.println(i);
		}
		
		
		//user 삽입
		UserVO insertvo = new UserVO();
		insertvo.setUserName("김동호");
		insertvo.setAddr("경기도 고양시");
		insertvo.setMobile("01056898596");
		insertvo.setBirthYear(1985);
		int result = dao.insert(insertvo);
		System.out.println(result>0 ? "삽입 성공" : "삽입 실패");
		
		
		
		
		UserVO updatevo = new UserVO();
		updatevo.setNo(22);
		updatevo.setMobile("01056899633");
		updatevo.setAddr("경기도 의정부시");
		System.out.println(dao.update(updatevo)? "수정성공" : "수정실패");
		
		result = dao.delete(22);
		System.out.println(result>0 ? "delete성공" : "delete실패");
	}
	
}
