package basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutException {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:\\new.txt"); 
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("c:\\test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
