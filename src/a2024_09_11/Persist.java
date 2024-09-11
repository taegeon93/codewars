package a2024_09_11;

import java.util.Arrays;

public class Persist {
	public static int persistence(long n) {
		if((n+"").length()<=1){
			
			return 0;
		}else {
			
			return calculation(n);
		}

	}
	private static int calculation(long n) {
		int count = 0;
		int val = 1;
		int[] convertArray = converter(n);
		int i = convertArray.length;
		
		while(!(i == 1)) {
			
			for(int j = 0; j < convertArray.length; j++) {
				
				val = val*convertArray[j];
			}
			convertArray = converter(val);
			count = count+1;
			val =1;
			i = convertArray.length;
		}
		return count;
	}
	private static int[] converter(long n) {
		
		String[]temp = (n+"").split("");
		return Arrays.stream(temp).mapToInt(i->Integer.parseInt(i)).toArray();
		
	}
//	bset solution 
	
//	public static int persistence(long n) {
//		long m = 1, r = n;
//
//    if (r / 10 == 0)
//      return 0;
//
//    for (r = n; r != 0; r /= 10)
//      m *= r % 10;
//
//    return persistence(m) + 1;
//    
//	}
}
