package Basic;

public class pencil {

	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어줄때
		//학생 당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 
		//출력하기
		int p=534;
		int s=30;
		int quot = p / s;
		int rem = p % s;
		
		
		System.out.println("학생당 "+quot+" 자루");
		System.out.println("남는연필 : "+rem+" 자루");
	}

}
