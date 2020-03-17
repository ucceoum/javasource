package basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterEx2 {

	public static void main(String[] args) {
		//키보드로부터 내용을 받아 들이고 (Scanner)
		//받은 내용을 파일에 쓰기
		//처음에 q가 입력이 되면 받아들이기를 멈춘 후 파일에 쓰기
		Scanner sc = new Scanner(System.in);
//		try(FileWriter fw = new FileWriter("d:\\temp\\WriterEx2.txt");
//			BufferedWriter bw = new BufferedWriter(fw)) {
//			System.out.println("파일에 기록하기 위한 데이터를 입력해 주세요.");
//			System.out.println("입력을 중단하고 싶으면 q를 입력해 주세요");
//			while(true) {
//				String str = sc.nextLine();
//				if(str.equals("q") || str.equals("Q")) {
//					System.out.println("종료");
//					break;
//				}
//				bw.write(str);
//				bw.newLine();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String str = "";
		String content = "";
		System.out.println("파일에 기록하기 위한 데이터를 입력해 주세요.");
		System.out.println("입력을 중단하고 싶으면 q를 입력해 주세요");
		do {
			str = sc.nextLine();
			if(!str.equalsIgnoreCase("q")) {
				content+=str+"\r\n";
			}
		}while(!str.equalsIgnoreCase("q"));
		try(FileWriter fw = new FileWriter("d:\\temp\\exam1.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
