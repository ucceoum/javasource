package basic;

import java.io.IOException;

public class WhileEx5 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int speed = 0, keyCode=0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {											//13과 10은 엔터를 의미
				System.out.println("============================");
				System.out.println("1.종속| 2.감속| 3.중지");
				System.out.println("============================");
				System.out.print("선 택 : ");
				
			}
			try {
				keyCode=System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(keyCode==49) {									//아스키코드
				speed++;
				System.out.println("현재 속도 = "+speed);
			}else if(keyCode==50) {
				speed--;
				System.out.println("현재 속도 = "+speed);
			}else if(keyCode==51) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
