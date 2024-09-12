package a2024_09_12;

public class Clock {
	
	public static int Past(int h, int m, int s) {
		
		
		return (s*1000) + (m*(1000*60)) + (h*(60000*60));
	}

}
