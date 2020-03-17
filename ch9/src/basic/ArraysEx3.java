package basic;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		
		//정렬
		int arr[] = {35,45,1,6,15,65,13,19,72};
		
		Arrays.sort(arr); 	//오름차순 정렬		
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println();
		char chArr[] = {'A','c','b','C','a','d','z'};
		
		
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		
		System.out.println();
		
		String strArr[] = {"apple","good","zero","abc","piano","banana"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		
		char chArr2[] = {'ㅎ','ㄱ','ㅁ','ㄷ','ㅅ','ㅋ',};
		
		Arrays.sort(chArr2);
		System.out.println(Arrays.toString(chArr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
