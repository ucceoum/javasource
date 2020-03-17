package shop;

import java.util.Scanner;

public class MyShop implements Shop{
	
	private User[] users = new User[2];				//사용자 정보
	private Product[] products = new Product[5];	//제품정보
	private Product[] cart = new Product[10];		//장바구니
	private int selUser;							//선택된 사용자 정보
	private String title;
	Scanner scan = new Scanner(System.in);
	

	@Override
	public void setTitle(String title) {		//shop 이름 지정
		this.title = title;
	}
	@Override
	public void genUser() {						//User 객체를 생성해서 배열에 담기
		
//		User user0 = new User("홍길동",PayType.CARD);
//		User user1 = new User("성춘향",PayType.CASH);
		users[0] = new User("홍길동",PayType.CARD);
		users[1] = new User("성춘향",PayType.CASH);
		
		
		
		
	}
	@Override
	public void genProduct() {
		products[0] = new SmartTV("삼성 3d smart", 250000, "4k");
		products[1] = new SmartTV("LG smart", 230000, "FHD");
		products[2] = new CellPhone("아이폰11", 990000, "KT");
		products[3] = new CellPhone("갤럭시 10", 1100000, "SKT");
		products[4] = new CellPhone("V50", 780000, "LG");
	}
	@Override
	public void start() {
		System.out.println(title+" 메인화면 - 계정 선택");
		System.out.println("-------------------------");
		
		//등록한 사용자 정보를 출력
		for(int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[x]종 료");
		System.out.print("선택 : ");			//사용자로부터 입력값 받기	
		String select = scan.next();
		
		switch (select) {
		case "x":
		case "X":	
			
			break;

		default:		//0,1
			selUser = Integer.parseInt(select);
			productList();
		}
		
	}
	
	
	
	
	
	
	public void checkout() {
		
		int sumPrice = 0;
		
		
		//장바구니 정보 출력		
		System.out.println();
		System.out.println(title+": 체크아웃");
		System.out.println("-------------------------");
		for(int i = 0; i < cart.length; i++) {
			
			if(cart[i] != null) {
				System.out.printf("[%d] %s (%d)\n",i,cart[i].getPname(),cart[i].getPrice());
				sumPrice += cart[i].getPrice(); 
			}
		}
		System.out.println("-------------------------");
		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.printf("합계 : %d 원 입니다.\n",sumPrice);
		System.out.println("[p]이전, [q]결제 완료");
		System.out.println("선택 : ");
		String sel = scan.next();
		
		switch (sel) {
		case "p":
		case "P":
			productList();
			break;
		case "q":
		case "Q":
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
			System.exit(0);
		default:
			System.out.println("메뉴를 확인해 주세요.");
			checkout();
			break;
		}
		
		
	}
	
	
	
	
	
	public void productList() {	//상품목록 출력
		System.out.println();
		System.out.println(title+": 상품목록");
		System.out.println("-------------------------");
		
		for(int i = 0; i < products.length; i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		//사용자로부터 입력값 받기
		//입력값 : 0~4 (상품선택시), h,c
		// h 선택시 : start호출
		// c 선택시 : checkout() 호출
		// 0~4 선택시 : cart에 담기 
		String sel = scan.next();
		if(sel.equals("h") || sel.equals("H")) {
			System.out.printf("\n## %s 선택 ##",sel);
			start();
		}else if(sel.equals("c") || sel.equals("C")) {
			System.out.printf("\n## %s 선택 ##",sel);
			checkout();
		}else if(Integer.parseInt(sel) >= 0 && Integer.parseInt(sel) < products.length) {

			for(int i = 0; i < cart.length; i++) {
				if(cart[i] == null) {
					cart[i] = products[Integer.parseInt(sel)];
					System.out.printf("\n## %s 선택 ##",sel);
					break;
				}else if(i == cart.length-1 && cart[i] != null) {
					System.out.println("\n자리없음");
					break;
				}
			}
			productList();
		}else {
			System.out.print("\n다시 선택");
			productList();
		}
		
		
		
		
//		switch (sel) {
//		case "h":
//		case "H" :
//			start();
//			break;
//		case "c" :
//		case "C" :
//			checkout();
//			break;
//		case "0": 
//		case "1" : 
//		case "2" :
//		case "3" :
//		case "4" :
//			for(int i = 0; i < cart.length; i++) {
//				if(cart[i] == null) {
//					cart[i] = products[psel];
//					break;
//				}
//			}
//			productList();
//			break;
//
//		default:
//			System.out.println("\n메뉴를 확인해 주세요");
//			productList();
//			break;
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
