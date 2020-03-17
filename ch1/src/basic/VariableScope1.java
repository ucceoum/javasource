package basic;

public class VariableScope1 {
	public static void main(String[] args) {
		//로컬(지역)변수 : 선언된 블록 내에서만 사용가능
		int v1 = 15;
		{	
			//로컬(지역)변수
			int v2 = v1+20;
	}
		System.out.println("v1 = "+v1);
		//System.out.println("v2 = "+v2);		//변수는 {}내에서 선언되고 사용
		
		
	}

}
