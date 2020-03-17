package basic;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 배열 복사
		// 배열은 한번 생성하면 길이를 변경할 수 없음
		// 더 많은 저장공간이 필요한 경우 큰 배열을 새로 만들고 복사해야 함
		int[] arr = {3,5,6,7,8};
		
		int[] tmp = new int[10];
		//값 복사
		
		
		System.arraycopy(arr, 0, tmp, 0, arr.length);				//arr 0 부터 -> tmp 0 부터
		
		
		for(int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]+"  ");
		}
		
		System.out.println("-----------");
		
		arr = tmp;
		
		for(int i = 0; i < tmp.length; i++) {
			System.out.println(arr[i]+"  ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
