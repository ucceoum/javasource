package basic;

import java.util.Scanner;

public class IfEx7 {

	public static void main(String[] args) {
		//사용자로 부터 점수를 입력받아 등급을 결정하기
		//System.in(기본 입력장치) : 키보드
		//System.out(기본 출력장치) : 모니터
		Scanner sc = new Scanner(System.in);
		// Scanner 객체를 이용해서 어떤 방식으로 받아들일 것인지를 결정

		System.out.println("숫자 입력 : ");
		
		int score = sc.nextInt();
		if(score>90) { 										//90보다 큰 경우
			System.out.println("등급은 A 입니다.");
		}else if(score>80) {
			System.out.println("등급은 B 입니다.");
		}else if(score>70) {
			System.out.println("등급은 C 입니다.");
		}else if(score>60) {
			System.out.println("등급은 D 입니다.");
		}else {												//작은 경우
			System.out.println("등급은 F 입니다.");
		}
		
		
		
	}

}
