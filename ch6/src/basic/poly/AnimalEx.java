package basic.poly;

public class AnimalEx {

	public static void main(String[] args) {
		
		//다형성(polymorphism) : 여러가지 형태를 가질 수 있는 능력
		// 부모 클래스의 타입의 참조 변수로 자식 클래스의 인스턴스 참조
		
		
		Animal animal1 = new Feline();
		Animal animal2 = new Canine();
		Animal animal3 = new Dog();
		Animal animal4 = new Lion();
		
		Canine canine1 = new Canine();
		
		
		//Feline feline = new Dong();
		
		Feline feline1 = new Feline();
		Lion lion1 = new Lion();
		
//		Animal animal5 = feline1;
		//animal5.eat();
//		print(feline1);
		
		
//		animal5 = lion1;
		//animal5.eat();
		print(lion1);
		
//		Animal animal5 = new Animal();
//		//animal5.eat();
//		print(animal5);
//		
		
		Dog dog = new Dog();
		print(dog);
		
		System.out.println("====");
		
		print(animal1);
		print(animal2);
		print(canine1);
}
//	public static void print(Lion lion) {
//		lion.eat();
//	}
//	public static void print(Dog dog) {
//		dog.eat();
//	}
//	
//	
	
	
	
	
//
//	public static void print(Feline f) {
//		f.eat();
//	}
//	
	public static void print(Animal animal) {
		animal.eat();
	}
//	
//	
	
	
	
	
	
	
}
