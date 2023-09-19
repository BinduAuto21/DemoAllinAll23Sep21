package collectionsJava;

import java.util.LinkedList;
//System.out.println();
public class LinkedList3a {

	public static void main(String[] args) {
		LinkedList<String>lL=new LinkedList<String>();
		
		lL.add("test");
		lL.add("qtp");
		lL.add("sel");
		lL.add("RPA");
		lL.add("RFT");
		
		System.out.println("content of LinkedList:"+lL);
		
		lL.addFirst("Bindus created List-->");
		
		lL.addLast("End");
		
		System.out.println("content of LinkedList:"+lL);
		
		System.out.println("content of LinkedList:"+lL.get(0));
		System.out.println("content of LinkedList:"+lL.get(1));
		
		lL.set(0, "Toms created List->");
		
		System.out.println("content of LinkedList:"+lL);
		
		

	}

}
