package basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//사용자로부터 정수를 입력받아 그 숫자가
		//짝수인지 홀수인지 출력하는 프로그램 작성하기
		//if~else 사용
		
		System.out.println("숫자 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" 은 짝수");
		}else {
			System.out.println(a+" 은 홀수");
		}
		
		
		
		
	}

}
