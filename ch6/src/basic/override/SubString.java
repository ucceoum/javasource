package basic.override;

public class SubString extends ListString {

	String name = "임꺽정";

	@Override
	public void list() {
		super.list();
		System.out.println("하위 클래스 이름 : "+name);
	}
	
	
	public void write() {
		super.list();
	}
	
	
	
}
