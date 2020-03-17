package basic;

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		//원래의 단어 맞추기
		
		String words[] = {"television","computer","mouse","phone"};
		
		
		
		for(int i = 0; i < words.length; i++) {
			//첫번째 문자열을 읽어와서 char 배열로 변경하기 
			char[] charArr = words[i].toCharArray();
			
			
//			for(char ch : charArr) {
//				System.out.printf("%c\t",ch);
//			}
//			System.out.println();
			
			//첫 번째 단어의 문제를 주기 위해 서로 자리 바꾸기
			for(int j = 0; j < charArr.length; j++) {
				int pos = (int)(Math.random()*charArr.length);
				char temp = charArr[j];
				charArr[j] = charArr[pos];
				charArr[pos]= temp;
			}
			
			
			
			
			//문제 출력
			System.out.printf("Q%d > %s 의 정답을 입력하세요 \n",(i+1),new String(charArr));
			
			//사용자로부터 답변 받기
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			
			
			//사용자가 입력한 답과 원래 문자가 맞는지 확인하기
			if(words[i].equals(answer)) {
				System.out.println("정답 !!");
				
			}else {
				System.out.println("오답 !!");
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
