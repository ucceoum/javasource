package basic;

public class BreakEx1 {

	public static void main(String[] args) {
		//주사위 숫자가 6이 나오면 반복문 종료
		while(true) {
			int dice = (int)(Math.random()*6+1);			//주사위
			System.out.println(dice);
			if(dice==6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
