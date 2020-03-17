package basic;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		// int 타입의 2행 3열 배열 생성
		int arr[][] = new int[2][3];
		
			
		//값 초기화
		arr[0][0] = 3;
		arr[0][1] = 4;
		arr[0][2] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		
		//행 길이
		System.out.println("arr.length = "+ arr.length);
		//열 길이
		System.out.println("arr[1].length = "+ arr[1].length);
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
