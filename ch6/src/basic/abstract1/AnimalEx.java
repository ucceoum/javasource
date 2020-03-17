package basic.abstract1;



// 추상화 : 클래스간의 공통점을 찾아내서 공통의 조상 만들기
// 구체화 : 상속을 통해 클래스를 구현, 확장하는 작업

public class AnimalEx {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		sound(dog);
		sound(cat);
		
		
		
		
}

	public static void sound(Animal animal) {
		animal.sound();
	}
	
	
	
	
	
	
}
