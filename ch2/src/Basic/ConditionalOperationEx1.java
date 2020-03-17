package Basic;

public class ConditionalOperationEx1 {
		public static void main(String[] args) {
			// 삼항연산자 : 피연산자1(조건식) ? 피연산자2(값 or 연산식) : 피연산자3(값 or 연산식)
			int score = 85;
			System.out.println(score<90 ? 'B' : 'A');
		}
}
