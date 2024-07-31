package a2024_07_31;

import java.util.stream.IntStream;

public class GetSum {
	public GetSum(int a, int b) {
		if(a == b) {
			System.out.println(a);
		}else{
		    int c = a > b ? IntStream.rangeClosed(b, a).sum() :  IntStream.rangeClosed(a, b).sum();
		    System.out.println(c);
	    }
//		best solution
//		 int res = 0;
//	      for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//	        res += i;
//	      }
//	      return a == b ? a : res;
		//
		// return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
	}
}
