package basic;

public class MyMath {
	int add(int a, int b) {
		return a+b;
	}
	
	long add(int a, long b) {
		return a+b;
	}
	
	long add(long a, int b) {
		return a+b;
	}
	
	
	long add(long a, long b) {
		return a+b;
	}
	
	int add(int[] a) {
		System.out.println("int add(int[] a)");
		int result = 0;
		for(int i : a) {
			result += i;
		}
		return result;
	}
	
	
}
