package basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx1 {

	public static void main(String[] args) {
		
		File dir = new File("d:\\temp\\dir");
		File file = new File("d:\\temp\\dir\\temp1.txt");
		File file2 = new File("d:\\temp\\test1.txt");
		File file3 = new File("d:\\temp\\test2.txt");
		
		
//		System.out.println(file.exists());
		
		//파일 삭제
//		file.delete();

		//디렉토리 생성
		if(!dir.exists()) {
			dir.mkdirs();
			
		}
		
		
		try {
			//파일생성
			if(!file.exists())	file.createNewFile();
			if(!file2.exists())	file2.createNewFile();
			if(!file3.exists())	file3.createNewFile();
			
			
			
			System.out.println("경로를 제외한 파일이름 : "+file.getName());
			
			String fileName = file.getName();
			int pos = fileName.lastIndexOf(".");
//			System.out.println(pos);
			
			
			System.out.println("확장자를 제외한 파일이름 : "+fileName.substring(0, pos));
			System.out.println("경로를 포함한 파일이름 : "+file.getPath());
			System.out.println("파일 절대 경로 : "+file.getAbsolutePath());
			System.out.println("File.pathSeparator : "+File.pathSeparator);
			System.out.println("File.pathSeparatorChar : "+File.pathSeparatorChar);
			// 유닉스 /, 윈도우 \
			System.out.println("File.separator : "+File.separator);
			System.out.println("File.separatorChar : "+File.separatorChar);
			
			
			
			
			
			
			
			
			
			
			
			
			//디렉토리 출력
			File root = new File("d:\\temp");
//			String[] lists = root.list();
//			for(String a : lists) {
//				System.out.println(a);
//			}
//			
			
			File[] fileList = root.listFiles();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("날짜\t시간\t형태\t크기\t이름");
			
			for(File f:fileList) {
				System.out.print(sdf.format(new Date(f.lastModified())));
				if(f.isDirectory()) {
					System.out.print("<dir> "+f.getName());
				}else {
					System.out.print(f.length()+"\t"+f.getName());
				}
				System.out.println();
			}
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
