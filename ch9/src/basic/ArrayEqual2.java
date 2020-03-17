package basic;

import java.util.Arrays;

public class ArrayEqual2 {

	public static void main(String[] args) {
		
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,42};
		boolean result = Arrays.equals(arr1,arr2);
		//받은 결과를 이용해서 배열 원소의 값이 같다
		//혹은 같지 않다를 출력하기
		
		System.out.println(result? "값이 같음" : "값이 같지 않음");
			
		
	}		
}
