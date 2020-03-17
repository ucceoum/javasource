package basic;

public class ArrayIndexException {

	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException
		if(args.length == 2) {
			System.out.println("args[0] : "+args[0]);
			System.out.println("args[1] : "+args[1]);
		}else {
			System.out.println("실행방법");
			System.out.println("java 클래스명 인자1 인자2");
		}
		
		
		
		
	}

}
