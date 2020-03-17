package basic;

public class SequentialSearch2 {

	public static void main(String[] args) {
		int arr[] = {10,18,35,45,55,65,99};
		
		//배열에서 48을 찾아서 위치 알려주기
		
		int key = 48;
		
		
		int i = 0;
		
		
		while(arr[i]<key) {
			i++;
		}
		if(arr[i] == key) {
			System.out.printf("%d : %d번째 검색 성공",key,(i+1));
		}else {
			System.out.printf("%d 검색 실패",key);
		}
		
		
		
	}

}
