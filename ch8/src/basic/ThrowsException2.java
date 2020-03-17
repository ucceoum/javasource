package basic;

public class ThrowsException2 {

	public static void main(String[] args) {
		int arr[] = new int[0];
		
		
		
		try {
			System.out.println("합계 : "+getTotal(arr));
			System.out.println("평균 : "+getAverage(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static double getAverage(int[] arr) throws Exception {
		if(arr.length == 0) {
			//강제 예외 발생
			throw new Exception("비어있는 배열입니다.");
		}
		return getTotal(arr)/arr.length;
	}
	public static int getTotal(int arr[]) throws Exception {
		if(arr.length == 0) {
			throw new Exception("비어있는 배열입니다.");
		}
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
}
