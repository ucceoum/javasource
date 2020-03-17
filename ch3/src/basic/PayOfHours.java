package basic;

import java.util.Scanner;

public class PayOfHours {

	public static void main(String[] args) {
		//사용자로부터 근무시간을 입력받아 근무시간에 따른 임금 구하기
		
		//근무시간이 8시간까지는 시간당 5000원의 임금을 적용하고
		//8시간 초과하는 경우에 기본임금의 1.5배를 지급하여 
		//총 임금을 구하시오(if~else 사용)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간 : ");
		int hours = sc.nextInt();
		int pay = 0;
		int rate = 5000;
		
		if(hours>8) {
			pay = rate*8 + (int)((hours-8)*rate*1.5);
		}else {
			pay = hours*rate;
		}
		
		System.out.println("근무시간 : "+hours+" 총 임금 : "+pay);
		

		
	}

}
