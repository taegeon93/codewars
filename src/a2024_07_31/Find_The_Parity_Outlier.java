package a2024_07_31;

import java.util.Arrays;

public class Find_The_Parity_Outlier {
	
	public Find_The_Parity_Outlier(int[] integers) {
		int[] temp = Arrays.stream(integers).filter(item -> item % 2 == 0).toArray();
		if(Arrays.stream(integers).filter(item -> item % 2 == 0).count() > 1) {
			temp = Arrays.stream(integers).filter(item -> item % 2 != 0).toArray();
			System.out.println(temp[0]);
		}else {
			System.out.println(temp[0]);
		}
//		내가 생각하는 best solution
//		int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
//	    int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
//
//	    return odd.length == 1 ? odd[0] : even[0];
	}
	
	
}
