package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx2 {

	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("d:\\temp\\test2.txt");
				Writer writer = new FileWriter("d:\\temp\\test2_copy2.txt")) {
			int data = 0;
			
			
			while((data = reader.read()) != -1) {
//				System.out.print((char)data);
				writer.write(data);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
