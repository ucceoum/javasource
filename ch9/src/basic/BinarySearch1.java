package basic;

import java.util.Arrays;

public class BinarySearch1 {

	public static void main(String[] args) {
		int arr[] = {10,18,35,45,55,65,99};
		
		//배열에서 48을 찾아서 위치 알려주기
		
		int key = 45;
		
		int index = Arrays.binarySearch(arr, key);
		
		System.out.println(index);
		
		
	}

}
