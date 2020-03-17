package basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		try {
			//한 바이트 읽기
//			int input = inputStream.read();
//			System.out.println(input);
			int input = 0;
			while((input = inputStream.read()) != -1) {
				outputStream.write(input);
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
