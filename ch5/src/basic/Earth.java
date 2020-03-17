package basic;

public class Earth {
	// static final : 상수(일반적으로 대문자로 표현함)
	public static final double EARTH_RADIUS = 6400;
	public final static double EARTH_SURFACE_AREA;		//순서 바뀌어도 됨
	
	
	static {
		
		EARTH_SURFACE_AREA = 4*EARTH_RADIUS*EARTH_RADIUS*Math.PI;
		
		
	}
	
	
	
	
}
