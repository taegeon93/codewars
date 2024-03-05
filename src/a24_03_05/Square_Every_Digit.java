package a24_03_05;

import java.util.LinkedList;

public class Square_Every_Digit {
	
	public Square_Every_Digit() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int x = 765;
		String result ="";
		if(x==0) {
			System.out.println(0);
		}
		
		while(x>0) {
			list.addFirst(x%10);
			x = x/10;
		}
		
		for(int i=0;i<list.size();i++) {
			result = result + (int)(Math.pow(list.get(i), 2));
		}
		System.out.println(result);
		
		
		
		
	}
}
