package codewars;

public class Find_the_odd_int {
	
	public Find_the_odd_int() {
		int[] a = {0,1,0,1,0};
		
	    for(int i=0;i<a.length;i++){
	    	int result = 0;
	      for(int j =0;j<a.length;j++){
	        if(a[i]==a[j]){
	          ++result;
	            }
	        }
	    
	      if(result%2==1){
	    	  	System.out.println("result"+result);
		         System.out.println(a[i]);
		   }
	        
	     }
	}
}
