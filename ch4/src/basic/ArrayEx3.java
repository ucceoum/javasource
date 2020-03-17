package basic;

public class ArrayEx3 {

	public static void main(String[] args) {
		// int 타입의 배열 5개를 선언, 생성하고 초기화
		int arr[] = new int[5];
		
		
		
		// 배열의 인덱스는 0번부터 시작
		arr[0] = 85;
		arr[1] = 75;
		arr[2] = 65;
		arr[3] = 55;
		arr[4] = 45;
//		arr[5] = 35;		//ArrayIndexOutOfBoundsException
		
		
		
		
		System.out.println("arr[0] : "+arr[0]);
		System.out.println("arr[1] : "+arr[1]);
		System.out.println("arr[2] : "+arr[2]);
		System.out.println("arr[3] : "+arr[3]);
		System.out.println("arr[4] : "+arr[4]);
		
		
		for(int i:arr) {
			//arr에서 순차적으로 값을 꺼내어 i에 담기
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
