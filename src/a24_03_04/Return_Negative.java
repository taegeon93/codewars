package a24_03_04;

public class Return_Negative {
	
	public Return_Negative() {
		int x = 5;
		
		int a = (x >0)? -1*x : 1*x;
		//-abs(x); 절대값에 마이너스만 붙여주는 방법
	    
	    System.out.println(a);
	}
}
