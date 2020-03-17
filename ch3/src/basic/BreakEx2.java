package basic;

public class BreakEx2 {

	public static void main(String[] args) {
		//1~100까지 숫자의 합을 구할 때
		//합이 100보다 크면 반복문 종료
		
		
		int sum = 0, i = 0;
		
		while(true) {
		
			i++;
			sum += i;
			
			if(sum>100) {
				break;
			}
		
		}
		System.out.printf("%d, %d",i,sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
