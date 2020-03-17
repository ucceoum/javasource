package basic;

import java.util.ArrayList;

public class FruitBox<T> {
	//Generics : 컴파일시 타입 체크 
	//			  타입 안정성 제공(다른 타입 담는 것 금지)
	ArrayList<T> list = new ArrayList<>();
	
	
	void add(T item) {
		list.add(item);
	}
	
	
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	  
	
	
	
}
