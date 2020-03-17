package user.mvc.util;

import java.util.Scanner;

import user.mvc.action.UserInsertAction;
import user.mvc.domain.UserVO;
import user.mvc.persistence.UserDAO;

public class UserConsolUtil {
	
	
	
	
	public UserVO user_insert(Scanner sc) {
		System.out.println("===== User 입력 =====");
		System.out.print("userName : ");
		sc.nextLine();
		String userName = sc.nextLine();
		System.out.print("birthYear : ");
		String birthYear = sc.nextLine();
		System.out.print("address : ");
		String addr = sc.nextLine();
		System.out.print("mobile : ");
		String mobile = sc.nextLine();
		UserVO insertVO = new UserVO();
		insertVO.setUserName(userName);
		insertVO.setBirthYear(Integer.parseInt(birthYear));
		insertVO.setAddr(addr);
		insertVO.setMobile(mobile);
		return insertVO;
		//사용자에게 입력받은 정보를 UserInsertAction 클래스에 넘겨주기
	}
	
	
	
	public void insertSuccessMessage() {
		System.out.println("회원 가입이 성공했습니다.");
	}
	public void insertFailMessage() {
		System.out.println("회원 가입이 실패했습니다.");
	}
	
	
	
	
	
//	
//	
//	public boolean user_update(Scanner sc) {
//		sc.nextLine();
//		System.out.println("수정할 정보를 입력해 주세요 : ");
//		System.out.println("회원 번호 : ");
//		int no = sc.nextInt();
//		sc.nextLine();
//		System.out.println("전화번호 : ");
//		String mobile = sc.nextLine();
//		System.out.println("주소 : ");
//		String addr = sc.nextLine();
//		
//		UserVO vo = new UserVO();
//		vo.setAddr(addr);
//		vo.setMobile(mobile);
//		vo.setNo(no);
//		
//		return dao.update(vo);
//	}
//	
//	
//	public boolean user_delete(Scanner sc) {
//		System.out.print("\n\n삭제할 회원 번호를 입력해 주세요 : ");
//		int no = sc.nextInt();
//		sc.nextLine();
//		return dao.delete(no)>0;
//	}
//	
//	
	
	//회원정보 - 한 사람에 대한 no 받아들이기
	public int user_select(Scanner sc) {
		System.out.print("\n조회할 회원의 번호를 입력해 주세요 : ");
		return sc.nextInt();
	}
//	
	
	public void user_info(UserVO vo) {
		System.out.println("\n==== 조회한 회원의 정보 ====");
		System.out.println(vo);
		
	}
	
}
