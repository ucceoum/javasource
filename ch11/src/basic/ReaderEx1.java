package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {

	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("d:\\temp\\test2.txt")) {
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
