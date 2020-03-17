package basic;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		int score[] = {79,88,91,25,45,37,86,100,55,67};
		
		int sum2 = 0;
		
		for(int i:score) {
			sum2 += i;
		}
		
		System.out.println("향상된 for/ 합계 : "+sum2);
		
		
		
		System.out.println("----------------------");
		System.out.println();
		
		//합계
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("전체 점수의 총 합계 : "+sum);
		System.out.println("전체 점수의  평균 : "+((double)sum/score.length));
		
		
		//최대값
		
		
		int max = score[0];
		int min = score[0];
		for(int i = 1; i < score.length; i++) {
			
			if(max < score[i]) {	
				max = score[i];	
			}
			
			
			if(min > score[i]) {
				min = score[i];
			}
			
		}
		System.out.println("최대점수 : "+max);
		System.out.println("최저점수 : "+min);
		
		int max2 = score[0];
		int min2 = score[0];
		for(int i:score) {
			if(max2 < i) {
				max2 = i;
			}
			if(min2 > i) {
				min2 = i;
			}
			
		}
		
		System.out.println("향상된 max : "+max2);
		System.out.println("향상된 min : "+min2);
		
		
		
		
		
		
	}

}
