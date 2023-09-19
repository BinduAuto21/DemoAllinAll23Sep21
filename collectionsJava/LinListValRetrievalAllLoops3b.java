package collectionsJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinListValRetrievalAllLoops3b {
	//System.out.println();
	public static void main(String[] args) {
    LinkedList<String>lL=new LinkedList<String>();
		
		lL.add("test");
		lL.add("qtp");
		lL.add("sel");
		lL.add("RPA");
		lL.add("RFT");
		
		System.out.println("content of LinkedList:"+lL);
		
		System.out.println("Using for loop");
		
		for(int i=0;i<lL.size();i++) {
			System.out.println(lL.get(i));
		}
		
		System.out.println("using while loop with iterator");
		
		Iterator<String> it = lL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using advanced for loop");
		
		for(String str:lL) {
			System.out.println(str);
		}
		
		System.out.println("using Plain while loop");
		
		int num=0;
		while(lL.size()>num) {
			System.out.println(lL.get(num));
			num++;
		}
	}

}
