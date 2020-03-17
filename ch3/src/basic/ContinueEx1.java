package basic;

public class ContinueEx1 {

	public static void main(String[] args) {
		//3의 배수가 아닌 숫자만 출력	
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) {
				continue;								//continue 이후의 문장을 실행할지
			}
			System.out.println(i);
			
			
		}
		
		
		
		
	}

}
