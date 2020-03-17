package basic;

import java.util.StringTokenizer;
//java.lang => 기본패키지 => import 구분 필요없음
//java.util



public class StringTokenizerEx2 {

	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("this/is/a/great", "/");
		
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
		String expression = "x=100*(200+300)/2";
		
		StringTokenizer token2 = new StringTokenizer(expression,"=*(+)/");
		
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		
		
		
		String expression2 = "1,김자바,100,100,100|2,박수재,95,80,83|3,이자바,75,65,83";
		
		StringTokenizer token3 = new StringTokenizer(expression2,"|,");
		
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
