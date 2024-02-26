package a24_02_26;

public class Multiples_of_3_or_5 {

		public Multiples_of_3_or_5() {
			int number = 15;
			int sum = 0;
			for(int i =1;i<number;i++) {
				if(i%3==0||i%5==0) {
					sum +=i;
				}
			}
			System.out.println(sum);
		}
			
}
   
