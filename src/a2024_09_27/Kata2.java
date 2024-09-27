package a2024_09_27;

public class Kata2 {

	public static String findNeedle(Object[] haystack) {
		String target = "needle";
		int i;
		for (i = 0; i < haystack.length; i++) {
			if (target.equals(haystack[i])) {
				break;
			}
		}
		return "found the needle at position " + i;
		
//		best solution
//		return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
	}
}