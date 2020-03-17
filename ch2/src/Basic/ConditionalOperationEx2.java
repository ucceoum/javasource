package Basic;

public class ConditionalOperationEx2 {
		public static void main(String[] args) {
			// 삼항연산자 : 피연산자1(조건식) ? 피연산자2(값 or 연산식) : 피연산자3(값 or 연산식)
			int score = 85;
			char grade = (score>90) ? 'A' : (score>80) ? 'B' : 'C';
			
			System.out.println("등급은"+grade+"입니다");
		}
}
