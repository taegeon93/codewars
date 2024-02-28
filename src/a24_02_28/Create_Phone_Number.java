package a24_02_28;

import java.util.Arrays;

public class Create_Phone_Number {

	public Create_Phone_Number() {
		int [] arr = {1,2,3,4,5,6,7,8,9,0};
		
		//String number = "("+arr[0]+arr[1]+arr[2] +") "+arr[3]+arr[4]+arr[5]+"-"+arr[6]+arr[7]+arr[8]+arr[9];
		
		
		String number = String.format("(%d%d%d) %d%d%d-%d%d%d%d",+arr[0],+arr[1],+arr[2],+arr[3],+arr[4],+arr[5],+arr[6],+arr[7],+arr[8],+arr[9]);
		System.out.println(number);
	}
}
