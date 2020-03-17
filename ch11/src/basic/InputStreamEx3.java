package basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		byte[] b = new byte[100];
		
		
		
		try {
			//charset => utf-8(한글3바이트), euc-kr, ksc5601, ms949....
			
			
			
			System.out.print("이름 입력 : ");
			int nameBytes = inputStream.read(b);
			String str1 = new String(b);
			System.out.println(nameBytes + " "+str1);
			
			System.out.print("하고 싶은말 입력 : ");
			int contentBytes = inputStream.read(b);
			String str2 = new String(b);
			System.out.println(contentBytes + " "+str2);
			
			
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
