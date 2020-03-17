package basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 사용자로부터 연도를 입력받아 윤년, 평년 구하기
		// 윤년 : 연도를 4로 나눈 나머지가 0이고 100으로 나눈 나머지가
		// 0이 아니거나 연도를 400으로 나눈 나머지가 0인 연도
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해 주세요 : ");
		int year = sc.nextInt();
		
		
		if (((year%4==0)&&(year%100!=0))||year%400==0) {
			System.out.println("윤년 입니다.");
		}else {
			System.out.println("평년 입니다.");
		}
			
		
		
		
		
		
		
		
		
		
	}

}
