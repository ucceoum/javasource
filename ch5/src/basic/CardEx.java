package basic;

public class CardEx {

	public static void main(String[] args) {
		
		System.out.println("Card Width = "+Card.width);
		System.out.println("Card Height = "+Card.height);
		
	
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 8;
		
		Card.width = 50;
		
		
		System.out.println("card1 kind = "+card1.kind+" number = "+card1.number+
				" width = "+Card.width+" Height = "+Card.height);
		System.out.println("card2 kind = "+card2.kind+" number = "+card2.number+
				" width = "+Card.width+" Height = "+Card.height);
		
		
	}
}
