package basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		byte[] b = new byte[100];
		
		
		
		try {
			//한 바이트 읽기
//			int input = inputStream.read();
//			System.out.println(input);
			while(inputStream.read(b) != -1) {
				outputStream.write(b);
				
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
