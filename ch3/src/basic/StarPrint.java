package basic;

public class StarPrint {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 0; j <= 4; j++) {
				System.out.print(j<i?"*":"");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
