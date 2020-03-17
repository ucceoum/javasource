package basic;

import java.util.Scanner;

public class StudentEx1 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int scores[] = null;		//(선언)
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("======================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("======================================");		
			System.out.print("선택 : ");
			
			//사용자로부터 번호 입력받기
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:					//사용자로부터 학생수를 입력받기 
									//입력받은 학생수에 해당하는 배열 생성 (생성)
				System.out.print("학생 수를 입력해 주세요 : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:					// 1번에서 생성된 배열 초기화(초기화)
									// for문 작업 scores 요소에 값 담기
				for(int i = 0; i < studentNum; i++) {
					System.out.printf("%d 번째 학생의 점수를 입력해 주세요 : ",i+1);
					scores[i] = sc.nextInt();
				}
				break;
			case 3:					// scores에 있는 값 출력
				System.out.println("\n=== 학생 점수 리스트 ===");
				for(int i = 0; i < studentNum; i++) {
					System.out.printf("%4d",scores[i]);
				}
				System.out.println();
				break;
			case 4:					// 점수의 총합, 평균, 최고점수, 최저점수 구하고 출력
//				int sum = 0, max = scores[0], min = scores[0];
				
				int sum, max, min;
				sum = max = 0;
				min = 99999;
				for( int score : scores) {
					if(max<score) {
						max=score;
					}
					if(min > score) {
						min = score;
					}
					sum += score;
				}
				
//				for(int i = 0; i < studentNum; i++) {
//					sum += scores[i];
//				}
//				for(int i = 1; i < studentNum; i++) {
//					if(max < scores[i]) {
//						max = scores[i];
//					}
//					if(min > scores[i]) {
//						min = scores[i];
//				}
				
				System.out.printf("\n점수의 총 합 : %d",sum);
				System.out.printf("\n점수의 평균 : %.3f",(double)sum/studentNum);			// %.2f : double 소수점 2자리까지
				System.out.printf("\n최고 점수 : %d",max);
				System.out.printf("\n최저 점수 : %d\n",min);
				break;
			case 5:					//루프를 멈추는 코드 작성
				run = false;
				System.out.println("종료되었습니다.");
				break;
			default :
				System.out.println("1~5 사이의 번호를 입력해 주세요.");
				break;
			}
			
		
		}
		
		
		
		
	}

}
