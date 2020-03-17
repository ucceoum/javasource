package basic.poly;

public class CaptionTVEx {

	public static void main(String[] args) {
		
		CaptionTV caption = new CaptionTV();
		// 참조변수의 타입에 따라 접근할 수 있는 범위가 달라짐
		TV tv = caption;
		
		
		//tv 참조변수로 접근할 수 있는 범위
		//tv.caption=true; 				(X)안됨
		//tv.displayCaption("hello"); 	(X)안됨
		tv.channel=5;
		tv.color="red";
		tv.power=true;
		tv.channelDown();
		tv.channelUp();
		tv.power();

		
		System.out.println();
		caption.caption=true;
		caption.channel=7;
		caption.color="blue";
		caption.power=false;
		caption.channelDown();
		caption.channelUp();
		caption.power();
		caption.displayCaption("Hello");
		
		
		
		
		System.out.println(tv.channel);
		System.out.println(tv.color);
		
		
		
		
		// java.lang.ClassCastException
//		CaptionTV caption2 = (CaptionTV) new TV(); 		(X) 안됨
		
		
		
		
		
		
		
	}

}
