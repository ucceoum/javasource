package basic;

public class FruitBoxEx1 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Grape> grapebox = new FruitBox<Grape>();
		FruitBox<Toy> toybox = new FruitBox<Toy>();
		
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
//		fruitbox.add(new Toy());
		
		applebox.add(new Apple());
//		applebox.add(new Grape());
		
		
		
		
		
		
	}

}
