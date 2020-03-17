package Basic;

public class OperatorEx10 {
public static void main(String[] args) {
		//논리 연산자 : !(not), &&(and), ||(or)
	
	
		int charCode='A';
		if(charCode>=65 && charCode<=96) {
			System.out.println("대문자");
		}
			
		int x=10;
		System.out.println(10 < x && x < 20);
		System.out.println(10 < x || x < 20);
	
		int y=10;
		System.out.println((y%2==0) || (y%3==0));
		System.out.println((y%2==0) || !(y%3==0));
		
	
	
	
}
}
