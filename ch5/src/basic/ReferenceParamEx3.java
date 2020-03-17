package basic;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4,50,77,106,7,99,64,90};
		
		printArr(arr);
		int total = sumArr(arr);
		System.out.println("배열 총합 : "+total);
		sortArr(arr);
		printArr(arr);
		
		
	}
	
	static void printArr(int[] arr) { //배열의 요소 출력
		
		for(int i : arr) {
			System.out.println("배열의 요소 : "+i);
		}
		
		
	}
	
	static int sumArr(int[] arr) {	//배열 요소 합계 리턴
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	
	
	static void sortArr(int[] arr) {	//배열의 오름차순 정렬
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}				
			}
			
		}
		
		
		
	}
	

}
