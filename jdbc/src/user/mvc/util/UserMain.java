package user.mvc.util;

import java.util.Scanner;

import user.mvc.action.Action;
import user.mvc.action.UserInsertAction;
import user.mvc.action.UserSelectAction;

public class UserMain {

	public static void main(String[] args) throws Exception {
		boolean flag = true;
		UserConsolUtil util = new UserConsolUtil();
		Action action = null;
		
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
				action = new UserInsertAction();
				action.execute(sc);
				
				break;
			case 2:
//				result = util.user_update(sc);
//				System.out.println(result? "수정성공" : "수정실패");
				break;
			case 3:
//				System.out.println(util.user_delete(sc)? "삭제 성공" : "삭제 실패");
				break;
			case 4:
				action = new UserSelectAction();
				action.execute(sc);
//				util.user_select(sc);
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
