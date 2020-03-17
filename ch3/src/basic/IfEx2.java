package basic;

public class IfEx2 {

	public static void main(String[] args) {
//		int score = 85;
//		char grade = (score>90) ? 'A' : (score>80) ? 'B' : 'C';
		
		//3개의 if문
		int score = 85;
		
		
		if(score>90) {
			System.out.println('A');
		}
		if(score>80) {
			System.out.println('B');
		}
		if(score<=80) {
			System.out.println('C');
		}
		
		
		
		
	}

}
