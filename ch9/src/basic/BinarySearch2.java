package basic;

import java.util.Arrays;

public class BinarySearch2 {

	public static void main(String[] args) {
		int arr[] = {10,99,18,55,45,35,65};
		
		
		Arrays.sort(arr);
		
		
		
		
		
		
		//배열에서 48을 찾아서 위치 알려주기
		
		int key = 45;
		
		int index = Arrays.binarySearch(arr, key);
		
		System.out.println(index);
		
		
	}

}
