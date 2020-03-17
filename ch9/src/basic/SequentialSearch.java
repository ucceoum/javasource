package basic;

public class SequentialSearch {

	public static void main(String[] args) {
		int arr[] = {10,99,18,55,45,35,65};
		
		//배열에서 65를 찾아서 위치 알려주기
		
		int a = 65;
		int i;
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				System.out.println((i+1)+"번째");
				break;
			}			
		}
		if(i == arr.length) {
			System.out.println("검색 실패");
		}
		
		
				
		
		
	}

}
