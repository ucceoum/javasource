package basic.poly;

public class Feline extends Animal {
	public Feline() {
		System.out.println("Feline 클래스 default 생성자");
	}
	
	@Override
	void eat() {
		System.out.println("고기를 먹습니다.");
	}
	
	
}
