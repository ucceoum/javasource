package basic;

public class Matrix {

	public static void main(String[] args) {
		
		int score[][] = {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};
//		
//		int score[][] = {
//				{100,100,100,100,90,90,80},
//				{20,20,20,20,45,60,70},
//				{30,40,30,30,60,70,50},
//				{40,50,20,20,30,50,80},
//				{50,60,50,50,60,60,90},
//				{50,60,50,50,100,30,50},
//				{30,40,30,30,60,70,50},
//				{40,50,20,20,30,50,80},
//				{50,60,50,50,60,60,90}
//		};
		
		//
		
		int result[][] = new int[score.length+1][score[0].length+1];
		
		
		int sum1 = 0;
		
		for(int i = 0; i < score.length; i++) {
			
			sum1 = 0;
			
			for(int j = 0; j < score[i].length; j++) {
				
				result[i][j] = score[i][j];
				
				sum1 += result[i][j];
						
			}
			result[i][result[i].length-1] = sum1;
		}
		
		
		
		

		int sum2 = 0;
		
		for(int i = 0; i < result[0].length; i++) {
			
			sum2 = 0;
			for(int j = 0; j < result.length; j++) {
				sum2 += result[j][i];
			}
			result[result.length-1][i] = sum2; 
		}
		
		
		
		
		
		
		for(int i[] : result) {
			for(int j : i) {
				System.out.printf("%7d",j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
