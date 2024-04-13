package codewars;



public class Who_likes_it {
	
	public Who_likes_it() {
		
		
		String [] a = {"Jacob", "Alex"};
		
	
        
	      if(a.length < 1){
				System.out.println("no one likes this");
			    }else if(a.length == 1){
				   System.out.println(a[0] +" likes this");
			  }else if(a.length == 2){
				  System.out.println (a[0]+" and "+a[1]+" like this");
		  	}else if(a.length == 3){
		  		System.out.println(a[0]+", "+a[1]+" and "+a[2]+" like this") ;
	      }else{
	        System.out.println(a[0]+", "+a[1]+" and "+(a.length-2)+" others like this");
	      }
	      
	      /*
	       * switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
		        }
		    }
		    Stmring.format 함수와 switch 로 깔 끔하게 해결 가능 조건 식을 너무 if문으에 의존함 다양한 조건문의 가능성을 생각할 필요성 있음
		    특정 출력 폼이 정해져 있을 경우 String.format  을 적극 활용 
	       */
		
	
		
		
	
	
	
	
	}
}
