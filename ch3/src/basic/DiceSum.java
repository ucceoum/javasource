package basic;

public class DiceSum {

	public static void main(String[] args) {

		// 두개의 주사위를 던지기
		//while과 Math.random() 메소드를 이용해서
		// 주사위 2개를 던졌을 때 나오는 값을 (값1,값2)로 출력하고
		//두 개의 합이 5가 아니라면 계속 주사위를 던지고
		// 함이 5라면 주사위를 멈추는 프로그램 작성
		// break;
		while(true) {
			
			int dice1 = (int)(Math.random()*500+1);
			int dice2 = (int)(Math.random()*500+1);
			
			System.out.printf("값1 : %d,\t 값2 : %d\n",dice1,dice2);
			
			if(dice1+dice2 == 5) {
				System.out.println();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
