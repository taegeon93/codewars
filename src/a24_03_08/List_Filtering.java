package a24_03_08;

import java.util.ArrayList;
import java.util.List;

public class List_Filtering {
	public List_Filtering() {
		List<Object>  list = List.of(1, 2, "a", "b");
		List<Object> list2 = new ArrayList<>();
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i) instanceof Integer) {			
				list2.add(list.get(i));
			}
		}
		
		System.out.println(list2);
			
	}
}
