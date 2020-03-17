package basic;

public class ArrayEx13 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{15,25},{35,45},{55,65}
		};
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		System.out.println("----");
		
		
		
		//향상된 for
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
