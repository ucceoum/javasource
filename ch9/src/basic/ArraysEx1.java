package basic;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		
		
		//Arrays : 배열을 조작하기 쉽게 만들어주는 클래스
		
		char chArr1[] = {'H','a','p','p','y'};
		
		//배열 복사
		char chArr2[] = new char[chArr1.length];
		System.arraycopy(chArr1, 0, chArr2, 0, chArr1.length);
		System.out.println(chArr2);
		
		
		
		char chArr3[] = Arrays.copyOf(chArr1, chArr1.length);
		System.out.println(chArr3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
