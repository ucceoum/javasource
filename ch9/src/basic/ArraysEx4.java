package basic;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysEx4 {
	public static void main(String[] args) {
		//sort(T[] a, Comparator <? super T> c)
		//T[] : 객체배열
		//Comparator<? super t> : 객체가 Comparator를 구현하고 있어야 한다.
		Integer arr[] = {35,45,1,6,15,65,13,19,72};
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		
		
		Character chArr[] = {'A','c','b','C','a','d','z'};
		Arrays.sort(chArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(chArr));
		
		
		
		
		String strArr[] = {"apple","good","zero","abc","piano","banana"};
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
