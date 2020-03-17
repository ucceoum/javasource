package basic;

public class ArrayEx15 {

	public static void main(String[] args) {
		//2차원 배열 복사
		int arr1[][] = {{10,20},{30,40}};
		
		
		int arr2[][] = new int[3][3];
		
		
//		for(int i = 0; i < arr1.length; i++) {
//			
//			for(int j = 0; j < arr1[i].length; j++) {
//				
//				arr2[i][j] = arr1[i][j];
//				
//			}
//		}
		
		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		
		
		
		for(int i[] : arr2) {
			for(int j : i) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
