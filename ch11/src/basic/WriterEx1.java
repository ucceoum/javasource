package basic;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx1 {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("d:\\temp\\test3.txt")) {
			
			writer.write("FileWriter는 한글로 된\r\n");
			writer.write("문자열을 출력할 수 있습니다.\r\n");
			writer.write("OutputStream과  달리 문자 단위의 \r\n");
			writer.write("출력이 가능합니다. ");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
