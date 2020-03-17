package user.dao.util;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		boolean flag = true;
		UserConsolUtil util = new UserConsolUtil();
		
		do {
			
			System.out.println("======== User Main ==========");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 수정");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 조회");
			System.out.println("5. 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				boolean result = util.user_insert(sc); 
				System.out.println(result? "삽입성공" : "삽입실패");
				break;
			case 2:
				result = util.user_update(sc);
				System.out.println(result? "수정성공" : "수정실패");
				break;
			case 3:
				System.out.println(util.user_delete(sc)? "삭제 성공" : "삭제 실패");
				break;
			case 4:
				util.user_select(sc);
				break;
			case 5:
				flag = false;
				break;

			default:
				break;
			}
			
			
		}while(flag);
		
		
		
		
		
	}

}
