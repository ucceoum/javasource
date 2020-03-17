package basic;

public class ArrayIndexException2 {

	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException
		try {										//Exception 나는 코드 작성
			System.out.println("args[0] : "+args[0]);
			System.out.println("args[1] : "+args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {	//Exception 이 발생하면 해야 할 코드 작성
			
			
			//개발할 당시나 혹은 로그로 기록할 때
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
			
			//사용자가 보는 화면에 보여줄 부분
//			System.out.println("실행방법");
//			System.out.println("java 클래스명 인자1 인자2");
		}
		
		
		
		
	}

}
