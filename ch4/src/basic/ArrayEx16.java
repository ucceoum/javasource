package basic;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{95,86}, {83,92,96}, {78,83,93,87,88}
				
		};
		
		//이차원 배열의 합과 평균값 구하기
		
		
		int result[][] = new int[arr.length][];
		
		result[0]= new int[arr[0].length+2];
		result[1]= new int[arr[1].length+2];
		result[2]= new int[arr[2].length+2];
		
		int sum = 0;
		int avg = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			
			for(int j = 0; j < arr[i].length; j++) {
				
				result[i][j] = arr[i][j];
				
				sum += result[i][j];
				
				
			}
			
			result[i][result[i].length-2] = sum;
			result[i][result[i].length-1] = sum/result[i].length;
			
		}
		
//		result[i][result[i].length-2] 
				
		
		
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0)
//		}
		
		
		
		
		
		
		
		
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------");

		
		for(int[] i : result) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
