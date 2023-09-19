package collectionsJava;

import java.util.ArrayList;
    //System.out.println();
public class ImpMethodsArList2b {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>();
		
		ar1.add("QTP");
		ar1.add("Selenium");
		ar1.add("Appium");
		ar1.add("UITesting");
		ar1.add("apiTestingRestAssured");
		ar1.add("mobileTesting");
		
		ArrayList<String>ar2=new ArrayList<String>();
		
		ar2.add("UITesting");
		ar2.add("apiTestingRestAssured");
		ar2.add("mobileTesting");
		ar2.add("totalTesting");
		ar2.add("regressionTestingusingScripts");
		ar2.add("regTestingOfApisUsingScripts");
		
		ar1.addAll(ar2);

		for(int k=0;k<ar1.size();k++) {
			System.out.println(ar1.get(k));
		}
		
		System.out.println("Duplicates there in the List");
		
		ar1.removeAll(ar2);
		System.out.println("*******************");
		
		for(int j =0;j<ar1.size();j++) {
			System.out.println(ar1.get(j));
		}
		System.out.println("*******************");
		
		ar1.retainAll(ar2);
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
	}

}
