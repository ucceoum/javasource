package basic;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 100;
		Data d2=copy(d);
		
		
		System.out.println("d.x = "+d.x+" d = "+d);
		System.out.println("d2.x = "+d2.x+" d2 = "+d2);
		
	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
	
}
