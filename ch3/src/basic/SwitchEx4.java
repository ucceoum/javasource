package basic;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요 : ");
		int jumsu = sc.nextInt();
		
		switch (jumsu/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
	}

}
