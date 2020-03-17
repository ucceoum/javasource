package basic;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		char abc[] = {'A','B','C','D','E'};
		
		
		char result[] = new char[10];
		System.arraycopy(abc, 0, result, 2, abc.length);			//대문자로 시작하면 클래스
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		System.out.println();
		
		
		//향상된 for문
		for(char ch:abc) {							//ch:맘대로   
			System.out.print(ch+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
