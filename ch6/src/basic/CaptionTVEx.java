package basic;

public class CaptionTVEx {

	public static void main(String[] args) {

		CaptionTV caption = new CaptionTV();
		
		caption.power = true;
		caption.color = "black";
		caption.channel = 13;
		caption.caption = false;
		
		System.out.println("전원상태 : "+caption.power);
		caption.channelUp();
		System.out.println("채널 : "+caption.channel);
		caption.caption = true;
		caption.displayCaption("Hello World");
		
		
		
		
		
		
		
		
		
		
		
	}

}
