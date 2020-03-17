package basic;

public class TvEx2 {

	public static void main(String[] args) {
		//TV 객체를 3개 생성하고 싶다면?
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();
		
		
		
		//객체 배열로 생성하기
		
		TV tvArr[] = new TV[3];
		
		tvArr[0] = new TV();
		tvArr[1] = new TV();
		tvArr[2] = new TV();
		
		print(tvArr[0]);
		print(tvArr[1]);
		print(tvArr[2]);
		
		
		TV tvArr2[] = {new TV(), new TV(), new TV()};
		
	}

	static void print(TV tv) {
		System.out.println("tv.channel : "+tv.channel);
		System.out.println("tv.color : "+tv.color);
		System.out.println("tv.power : "+tv.power);
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
