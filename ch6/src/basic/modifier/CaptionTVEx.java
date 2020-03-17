package basic.modifier;

public class CaptionTVEx {

	public static void main(String[] args) {

		boolean power = true;
		String color = "black";
		int channel = 13;
		boolean caption = false;
		
		CaptionTV captionTV = new CaptionTV(color, power, channel, caption);
		
		
		
		
		
		
		
		System.out.println("전원상태 : "+captionTV.isPower());
		captionTV.channelUp();
		System.out.println("채널 : "+captionTV.getChannel());
		captionTV.caption = true;
		captionTV.displayCaption("Hello World");
		
		
		
		
		captionTV.print();
		
		
		
		
		
		
	}

}
