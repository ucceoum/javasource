package basic;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		
		int arr1[][] = {{1,2},{3,4}};
		
		//얕은 복사     <->   깊은 복사
		int arr2[][] = Arrays.copyOf(arr1, arr1.length);
		
		//주소값 비교
		System.out.println(arr1.equals(arr2));
		
		
		//1차 항목의 값만 비교
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		//중첩된 항목의 값까지 비교 후 리턴
		System.out.println(Arrays.deepEquals(arr1, arr2));
		

		
		
		
		int arr3[][] = {{1,2}, {3,4}};
		
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println(Arrays.deepEquals(arr1, arr3));
		
		
		
		
		
	}

}
