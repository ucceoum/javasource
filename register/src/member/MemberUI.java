package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberUI {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		MemberConsoleUtil util = new MemberConsoleUtil();
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("===== 회원관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				Member newMember = util.getNewmember(sc);
				util.printAddSuccessMessage(newMember);
				list.add(newMember);
				break;
			case 2:
				util.printMemberList(list);
				break;
			case 3:
				Member updateMember = util.getUpdateMember(sc, list);
				if(updateMember == null) {	//아이디를 찾을 수 없음
					util.printModifyFailMessage();
				}else {
					util.printModifySuccessMessage(updateMember);
				}
				break;
			case 4:
				//removeMember return : new member(), removeMember, null
				//						삭제 성공	  	      취소			못찾음
				Member removeMember = util.removeMember(sc, list);
				if(removeMember == null) {
					util.printRemoveFailMessage();
				}else if(removeMember.getName() == null) {
					util.printRemoveSuccessMessage();
					util.printMemberList(list);
				}
				//안쓰면 취소
				
				
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
		
			default:
				
				break;
			}
	
		}while(!stop);
	}


}
