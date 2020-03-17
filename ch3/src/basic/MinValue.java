package basic;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		//사용자로 부터 세 개의 숫자를 입력받아 가장 작은 수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자 : ");
		int num3 = sc.nextInt();
		
		int min = num1;
		int max = num1;
		
		
		if(min>num2) {
			min = num2;
		}
		if(min>num3) {
			min = num3;
		}
		
		System.out.println("가장 작은 숫자 : "+min);
		
		if(max<num2) {
			max = num2;
		}
		if(max<num3) {
			max = num3;
		}
		
		System.out.println("가장 큰 숫자 : "+max);
		
		
		
	}

}
