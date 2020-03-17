package basic;

import java.util.Arrays;
import java.util.Comparator;

public class Member2Ex {

	public static void main(String[] args) {
		
		Member2 member[] = new Member2[5];
		
		
		member[0] = new Member2("정해인");
		member[1] = new Member2("박보검");
		member[2] = new Member2("송중기");
		member[3] = new Member2("송강호");
		member[4] = new Member2("조인성");
		
		
		
		// java.lang.ClassCastException : basic.Member2 cannot be cast to java.lang.Comparable
		Arrays.sort(member);
		
		System.out.println(Arrays.toString(member));
		
		Arrays.sort(member, Comparator.reverseOrder());

		System.out.println(Arrays.toString(member));
	}

}
