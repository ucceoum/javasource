package basic;

public class ReferenceReturnEx2 {

	public static void main(String[] args) {
		int[] result = array();
		
		for(int i : result) {
			System.out.print(i+" ");
		}
		
		
		
	}	
	
	static int[] array() {
		int arr[] = {6,5,4,3,2,1};
		return arr;
	}
	
	

}
