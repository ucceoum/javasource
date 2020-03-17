package user.dao.util;

import java.util.Scanner;

public class UserConsolUtil {
	
	UserDAO dao = new UserDAO();
	
	
	public boolean user_insert(Scanner sc) {
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
		
		UserVO vo = new UserVO();
		vo.setUserName(userName);
		vo.setBirthYear(Integer.parseInt(birthYear));
		vo.setAddr(addr);
		vo.setMobile(mobile);
		//db입력처리
		int result = dao.insert(vo);
		
		return result>0;
	}
	
	
	public boolean user_update(Scanner sc) {
		sc.nextLine();
		System.out.println("수정할 정보를 입력해 주세요 : ");
		System.out.println("회원 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.println("전화번호 : ");
		String mobile = sc.nextLine();
		System.out.println("주소 : ");
		String addr = sc.nextLine();
		
		UserVO vo = new UserVO();
		vo.setAddr(addr);
		vo.setMobile(mobile);
		vo.setNo(no);
		
		return dao.update(vo);
	}
	
	
	public boolean user_delete(Scanner sc) {
		System.out.print("\n\n삭제할 회원 번호를 입력해 주세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		return dao.delete(no)>0;
	}
	
	
	public void user_select(Scanner sc) {
		System.out.print("\n\n조회할 회원의 번호를 입력해 주세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		UserVO vo = dao.selectOne(no);
		System.out.printf("번호\t이름\t생년\t주소\t\t전화번호\n");
		System.out.println(vo);
	}
	
	
}
