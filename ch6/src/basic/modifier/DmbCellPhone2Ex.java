package basic.modifier;

public class DmbCellPhone2Ex {

	public static void main(String[] args) {
		
		DmbCellPhone2 phone = new DmbCellPhone2("자바폰","balck",9);
		
		
		System.out.println("모델명 : "+phone.getModel());
		System.out.println("색상 : "+phone.getColor());
		System.out.println("채널 : "+phone.getChannel());
		
	}
}
