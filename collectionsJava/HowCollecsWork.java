package collectionsJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HowCollecsWork {
        //System.out.println();
	public static void main(String[] args) {
		
		Map<String,Integer>marks = new HashMap<String,Integer>();
		
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Navdeep", 600);
		
		marks.put(null, 500);
		marks.put(null, 700);
		marks.put("Nav", 900);
		
		//for traversing the hashmap entry and entry set concept used:
//		for(Entry<String, Integer> m:marks.entrySet()) {
//		System.out.println(m.getKey()+" "+m.getValue());	
//		}

	}

}
