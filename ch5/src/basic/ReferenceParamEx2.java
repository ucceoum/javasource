package basic;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		
		int x[] = {10};
		
		System.out.println("main () : "+x[0]);
		
		
		change(x);
		System.out.println("After change () : "+x[0]);
		
		
	}
	
	static void change(int[] arr) {	//주소복사
		
		arr[0] = 2000;
		System.out.println("change () : "+arr[0]);
	}

}
