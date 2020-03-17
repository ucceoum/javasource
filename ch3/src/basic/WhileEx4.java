package basic;

public class WhileEx4 {

	public static void main(String[] args) {
		//3의 배수이거나 5의 배수의 합
		//while
		
		
		int i = 1;
		int sum = 0;
		
		
		while(i <= 100) {
			
			if(i%3==0 || i%5==0) {
				sum += i;
			}	
			
			i++;
		}
		
		
		
		System.out.println("3의 배수이거나 5의 배수의 합 : "+sum);
		
		
		
		
		
	}

}
