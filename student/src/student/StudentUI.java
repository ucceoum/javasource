package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentUI {

	public static void main(String[] args) {
		
		boolean run = true;
		ArrayList<Student> students = new ArrayList<Student>();
		while(run) {
			
			System.out.println("--------- <학생 정보 관리 프로그램> ---------");
			System.out.println("          1. 학생정보 입력");
			System.out.println("          2. 학생정보 전체 조회");
			System.out.println("          3. 학생정보 개별 조회");
			System.out.println("          4. 프로그램 종료");
			System.out.print("     선택 : ");
			String select = sc.next();
			
			switch (select) {
			case "1":
				Student createS = createS(students);
				if(createS != null) {
					students.add(createS);
					System.out.println(createS.getStudent_name()+" 학생 정보가 입력되었습니다.");
				}
				break;
			case "2":
				printSAll(students);
				break;
			case "3":
				printS(students);
				break;
			case "4":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1~4 사이의 숫자를 입력해 주세요");
				break;
			}
			
		}
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static Scanner sc = new Scanner(System.in);

	
	static Student createS(ArrayList<Student> list) {
		System.out.println("---- 새로운 학생 정보 입력 ----");
		int student_no;
		String student_name;
		int student_year;
		String student_addr;
		String student_birth;
		while(true) {
			try {
				System.out.print("학 번 : ");
				student_no = sc.nextInt();
				break;
			}catch(Exception e){
				System.out.println("정확한 학번을 입력해 주세요.");
				sc.nextLine();
			}
		}
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(s.getStudent_no() == student_no) {
				System.out.println("이미 있는 학번입니다.");
				return null;
			}
		}
		System.out.print("이 름 : ");
		student_name = sc.next(); 
		while(true) {
			try {
				System.out.print("학 년 : ");
				student_year = sc.nextInt();
				break;
			}catch(Exception e){
				System.out.println("정확한 학년을 입력해 주세요.");
				sc.nextLine();
			}
		}
		System.out.print("주 소 : ");
		student_addr = sc.next();
		System.out.print("생 일(예시 : 05/11) : ");
		student_birth = sc.next();
		return new Student(student_no, student_name, student_year, student_addr, student_birth);
		
	}
	
	
	static void printSAll(ArrayList<Student> list){
		System.out.println("---- 학생 정보 보기 ----");
		System.out.println("학 번\t이 름\t학 년");
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
	}
	
	static void printS(ArrayList<Student> list) {
		int no;
		while(true) {
			try {
				System.out.print("검색하고자 하는 학생의 학번을 입력하세요 ");
				no = sc.nextInt();
				break;
			}catch(Exception e){
				System.out.println("정확한 학번을 입력해 주세요.");
				sc.nextLine();
			}
		}
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(s.getStudent_no() == no) {
				System.out.println("---- 학생 개별 정보 보기 -----");
				System.out.println("이름 : "+s.getStudent_name());
				System.out.println("학년 : "+s.getStudent_year());
				System.out.println("주소 : "+s.getStudent_addr());
				System.out.println("생일 : "+s.getStudent_birth());
				return;
			}
		}
		System.out.println("학번과 일치하는 학생이 없습니다");
		
	}
	
	
	
}
