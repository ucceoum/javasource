package basic;

public class Multiple1 {

	public static void main(String[] args) {
		// 1~100사이의 수 중에서 3의 배수는 맞지만
		// 9의 배수는 아닌 수의 합 구하기
		// for문과 if문 사용
		
		int result = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i%3==0 && i%9!=0) {
				result += i;
			}
			
		}
		
		System.out.println("3의 배수는 맞고 9의 배수는 아닌 수의 합 : "+result);
		
		
		//3의 배수와 5의 배수의 합 구하기\
		//1~100까지
		
		result = 0;
		
		for(int i = 1; i <=100; i++) {
			
			if(i%3==0 || i%5==0) {
				result += i;
			}
			
		}
		
		System.out.println("3의 배수와 5의 배수의 합 : "+result);
		
		
		
	}

}
