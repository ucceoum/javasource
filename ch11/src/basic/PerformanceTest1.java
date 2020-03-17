package basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceTest1 {

	public static void main(String[] args) {
		//mp4 => InputStream, OutputStream
		
		try(FileInputStream fis = new FileInputStream("d:\\temp\\video.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("d:\\temp\\video_copy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data = 0;
			long start = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("파일 전송시 걸린 시간 : "+(end-start)+" ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try(FileInputStream fis = new FileInputStream("d:\\temp\\video.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("d:\\temp\\video_copy2.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {

				byte[] b = new byte[1024];
				long start = System.currentTimeMillis();
				while(bis.read(b) != -1) {
					bos.write(b);
				}
				
				long end = System.currentTimeMillis();
				
				System.out.println("파일 전송시 걸린 시간 : "+(end-start)+" ms");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
	}

}
