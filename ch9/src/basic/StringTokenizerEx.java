package basic;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer token = new StringTokenizer("This is a test");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
		
	}

}
