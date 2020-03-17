package basic;

public class IfEx4 {

	public static void main(String[] args) {
		// score가 	90보다 큰 경우 	:
		// 			80보다 큰 경우 	:
		//			70보다 큰 경우 	: 
		//			60보다 큰 경우	:
		//					    : F
		int score = 76;
		
		if(score>90) { 										//90보다 큰 경우
			System.out.println("등급은 A 입니다.");
		}else if(score>80){
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
