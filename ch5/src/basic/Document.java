package basic;

public class Document {
	static int count  = 0;
	String name;
	int	a;
	
	public Document() {
		this("제목없음"+ ++count);
	}
	
	
	
	public Document(String name) {
		this.name = name;
		System.out.println("문서 "+this.name+" 이 생성되었습니다.");
	}
	
	public Document(String name,int a) {
		this.name = name;
		this.a = a;
		System.out.println("문서 "+this.name+" 이 생성되었습니다.");
	}
	
	
}
