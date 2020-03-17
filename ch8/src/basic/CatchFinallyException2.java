package basic;

public class CatchFinallyException2 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(3/0);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//exception 발생시 프로그램이 멈추기 전 이 블럭을 꼭 처리 
			//ex 자원해제 작업
			System.out.println("다시 실행하세요");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
