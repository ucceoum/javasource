package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberConsoleUtil {


	
	
	
	public static Member getNewmember(Scanner sc) {
		
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("아이디 : ");
		int id = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		String addr = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		return new Member(id,name,addr,nation,email,age);
	}
	
	public void printAddSuccessMessage(Member member) {
		
		System.out.println(member.getName()+"회원 정보 추가 성공");
	}
	
	public void printModifySuccessMessage(Member member) {
		System.out.println(member.getName()+" 회원 정보 수정 성공");
	}
	
	public void printModifyFailMessage() {
		System.out.println("회원 아이디를 확인해 주세요");
	}
	
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패하였습니다.");
	}
	
	public void printRemoveSuccessMessage() {
		System.out.println("회원 정보 삭제에 성공하였습니다.");
	}
	
	public void printMemberList(List<Member> list) {
		System.out.println("회원아이디\t이름\t주소\t이메일\t국가\t나이");
		for(Member m : list) {
			System.out.println(m);
			
		}
	}
	
	public Member getUpdateMember(Scanner sc, List<Member> list) {
		//수정정보 받기
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		int id = sc.nextInt();
		
		
		//수정하기
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			if(member.getId() == id) {
				System.out.print("수정할 주소를 입력하세요 : ");
				String addr = sc.next();
				member.setAddr(addr);
				System.out.print("수정할 이메일을 입력하세요 : ");
				String email = sc.next();
				member.setEmail(email);
				return member;	//수정된 member
			}
		}
		return null;
	}
	
	public Member removeMember(Scanner sc, List<Member> list) {
		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
		int id = sc.nextInt();
		Member removeMember = null;
		for(int i = 0; i < list.size(); i++) {
			removeMember = list.get(i);
			if(removeMember.getId() == id) {
				System.out.println("정말로 삭제하시겠습니까? 예(1) 아니오(2)");
				int confirm = sc.nextInt();
				if(confirm == 1) {	//리스트에서 삭제하기
					list.remove(i);
					return new Member();
				}else if(confirm == 2) {	//메뉴로 돌아가기
					return removeMember;
				}
			}
		}
		
		return null;	//삭제 멤버 없음.
	}
	
	
	
}
