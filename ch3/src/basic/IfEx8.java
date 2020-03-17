package basic;

import java.util.Scanner;

public class IfEx8 {
	public static void main(String[] args) {
		System.out.println("계절을 알고 싶은 월을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		
		if(month==3||month==4||month==5) {
			System.out.println("계절은 봄 입니다.");
		}else if(month==6||month==7||month==8) {
			System.out.println("계절은 여름 입니다.");
		}else if(month==9||month==10||month==11) {
			System.out.println("계절은 가을 입니다.");
		}else if(month==12||month==1||month==2) {
			System.out.println("계절은 겨울 입니다.");
		}else {
			System.out.println("월을 다시 확인해 주세요.");
		}
	}
}
