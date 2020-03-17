package basic;

public class Person {
	/*final : 변수 앞에 붙은 경우 변수값 변경 금지
	 * 		: 초기화가 만드시 필요함(생성자 or 직접 할당)
	 */
	
	
	final String nation = "Korean";
	final String ssn;
//	static final double EARTH_RANDIUS = 6400;
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	
	
}
