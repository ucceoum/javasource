package basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("css");
		set.add("Java");
		set.add("javascript");
		set.add("servlet");
		set.add("Html");
		set.add("jsp");
		set.add("jdbc");
		set.add("css");
		
		
		for(String s:set) {
			System.out.println(s);
		}
		
		
		
	}

}
