package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		
		try(FileReader fis = new FileReader("d:\\temp\\test3.txt");
			BufferedReader br = new BufferedReader(fis);
			FileWriter fw = new FileWriter("d:\\temp\\test3_copy2.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			
			//버퍼에서 읽고, 버퍼에다 쓰고
			String str = null;
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
