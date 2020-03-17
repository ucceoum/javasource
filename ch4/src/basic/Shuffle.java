package basic;

public class Shuffle {

	public static void main(String[] args) {
		// 카드번호 1~45 까지 생성
		int card[] = new int[45];
		
		// 카드번호 삽입하기
		for(int i = 0; i < card.length; i++) {
			card[i] = i+1;
		}
		
		
		//카드 확인하기
		for(int i : card) {
			System.out.print(i+" ");
			
			
		}
		
		
		
		// 생성된 카드를 서로 섞은 후 출력하기
		
		for(int i = 0; i < card.length; i++) {
			//어느 카드랑 바꿀 것인지 위치 설정
			int j = (int)(Math.random()*45);
			int temp = card[i];
			card[i] = card[j];
			card[j] = temp;
			
		}
		System.out.println();
		
		//섞인 카드 확인하기
		
		for(int i : card) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
