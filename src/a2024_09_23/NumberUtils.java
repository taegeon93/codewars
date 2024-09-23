package a2024_09_23;

public class NumberUtils {

	public static boolean isNarcissistic(int number) {
		String base = ""+number;
		int sum = 0;
		double length = base.length();
		for(int i = 0;i<length;i++) {
			double temp = Integer.parseInt(Character.toString(base.charAt(i)));
			sum += Math.pow(temp,length);
		}
		
		
		return number == sum ? true : false;
		
//		best solution
//		int length = String.valueOf(number).length();
//	    return number == Arrays.stream(String.valueOf(number).split(""))
//	                .mapToInt(Integer::parseInt)
//	                .mapToDouble(m -> Math.pow(m, length))
//	                .sum();
	}
	

}
