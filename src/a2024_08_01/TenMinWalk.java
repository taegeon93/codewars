package a2024_08_01;

public class TenMinWalk {
	public TenMinWalk(char[] walk) {
		int w =0;
		int n =0;
		int e =0;
		int s =0;
		if(walk.length>10||walk.length<10) {
			System.out.println(false);
		}else {
			for(int i =0;i<walk.length;i++) {
				switch(walk[i]) {
					case 'w':
						w++;
						break;
					case 'n':
						n++;
						break;
					case 'e':
						e++;
						break;
					case 's':
						s++;
						break;
				}
			}
			if(w==e && s==n) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
//		best solution
//		if (walk.length != 10) return false;
//	    
//	    int x = 0, y = 0;
//	    for (char c: walk) {
//	    	switch (c) {
//	      	case 'n': y++; break;
//	        case 's': y--; break;
//	        case 'w': x++; break;
//	        case 'e': x--; break;
//	      }
//	    }
//	    
//	    return x == 0 && y == 0;
	  }
}

