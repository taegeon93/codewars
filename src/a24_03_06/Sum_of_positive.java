package a24_03_06;

public class Sum_of_positive {
		public Sum_of_positive() {
			int[] arr = {1,2,3,4,5};
			int sum = 0;
		    for(int i =0;i<arr.length;i++){
		       if(arr[i]>0){
		          sum+=arr[i];
		         }
		    }
		    
		    System.out.println(sum);
		}
}


