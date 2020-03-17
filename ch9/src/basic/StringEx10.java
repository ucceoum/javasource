package basic;

public class StringEx10 {

	public static void main(String[] args) {
		
		
		String str1 = "aabbccAABBCCaa";
		
		//aa라는 문자열이 몇 개 있는지 찾아서 출력하기
			
		String match = "aa";
		int cnt = 0, position = 0;
		while((position = str1.indexOf(match,position)) != -1) {
			cnt++;
			position+=match.length();
		}
		System.out.println(match+" : "+cnt);
	}

}
