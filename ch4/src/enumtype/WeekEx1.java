package enumtype;

public class WeekEx1 {

	public static void main(String[] args) {
		Week day1 = Week.FRIDAY;
		Week day2 = Week.WEDNESDAY;
		
		
		System.out.println(day1.compareTo(day2));	//2
		System.out.println(day2.compareTo(day1));	//-2
		
		
		
		Week[] days= Week.values();					
		
		for(Week day : days) {
			System.out.println(day);
		}
		
		
		
		
		
//		System.out.println();
//		System.out.println(days[0]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
