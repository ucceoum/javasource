package basic;

public class ArrayEx14 {

	public static void main(String[] args) {
		
		//2차원 배열에서 열의 개수를 다르게 지정하기
		
		int english[][] = new int[2][];
		
		
		english[0] = new int[2];
		english[1] = new int[3];
		
		
		
		english[0][0] = 5;
		english[0][1] = 6;
		
		english[1][0] = 7;
		english[1][1] = 8;
		english[1][2] = 9;
		
		for(int i = 0; i < english.length; i++) {
			for(int j = 0; j < english[i].length; j++) {
				System.out.print(english[i][j]+"  ");
			}

			System.out.println();
		}
		
		int java[][] = {{78,88},{89,92,65}};
		
		
		
		
		
		
		
		
	}

}
