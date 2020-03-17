package basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutException2 {

	public static void main(String[] args) {
		FileInputStream fis = null; 
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("c:\\new.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\test.txt");
			bos = new BufferedOutputStream(fos);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				bis.close();
				fos.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
