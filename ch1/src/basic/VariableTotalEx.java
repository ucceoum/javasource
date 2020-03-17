package basic;

public class VariableTotalEx {

	public static void main(String[] args) {
		//타입 변수명=값;
		
		// 값(리터럴) - 정수, 실수, 문자, 논리
		
		// 정수 리터럴 - 0, 15, -180, ....  015(8진수), 0x15(16진수)
		// 실수 리터럴 - 0.25, -3.14, 5E7, 0.12e-5 ...
		// 문자 리터럴 - 'ㅋ', 'a', 'A', '\t' ...
		// 논리 리터럴 - true, false
		//  a,b 값을 서로 바꾸어 출력하기
		int a=15, b=12;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a ="+a+", b ="+b);
	}

}
