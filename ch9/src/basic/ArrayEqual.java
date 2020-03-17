package basic;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		
		int arr1[] = {10,73,2,-5,42};
		int arr2[] = {10,73,2,-5,41};
		boolean result = arrayEquals(arr1,arr2);
		//받은 결과를 이용해서 배열 원소의 값이 같다
		//혹은 같지 않다를 출력하기
		
		System.out.println(result);
			
		
	}
	
	
	
	public static boolean arrayEquals(int arr1[], int arr2[]) {
		//1차원 배열 원소의 값이 같은지 비교하고
		//그 결과를 true false로 리턴하기
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
