package a2024_08_12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryAddition {
	
	public static String binaryAddition(int a, int b) {
		
		return Integer.toBinaryString(a+b);
	}
	public static int[] map(int[] arr) {
		
		
		
		return Arrays.stream(arr).map(i->i+i).toArray();
	}
}
