package basic.poly;

public class Lion extends Feline {
	public Lion() {
		System.out.println("Lion 클래스 default 생성자");
	}
	

	@Override
	void eat() {
		System.out.println("육식주의자");
	}

}
