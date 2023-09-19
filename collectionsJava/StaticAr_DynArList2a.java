package collectionsJava;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
    //System.out.println();
public class StaticAr_DynArList2a {

	public static <E> void main(String[] args) {
		
		System.out.println("Static Array-Array");
		
		int a[]=new int[3];
		
		a[0]=11;
		a[1]=13;
		a[2]=15;
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Dynamic Array-ArrayList---Also Non-Generic==>yellow Warning Raw Type");

		ArrayList ar = new ArrayList();
		
		ar.add(12);
		ar.add(14);
		ar.add(16);
		
		ar.add(12.33);
		ar.add("user");
		
		ar.add('d');
		ar.add(true);
		ar.add(false);
		
		System.out.println(ar.size());
		
		for(int j=0;j<ar.size();j++) {
			System.out.println(ar.get(j));
		}
		
		System.out.println("Generic Array Lists-defining dataType in Angular brackets");
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(4);
		
		ArrayList<String>ar2=new ArrayList<String>();
		
		ArrayList<Float>ar3=new ArrayList<Float>();
		
		//ArrayList<Charset>ar4=new ArrayList<Charset>();
		
		ArrayList<Boolean>ar5=new ArrayList<Boolean>();
		ar5.add(true);
		ar5.add(false);

		for(int k=0;k<ar5.size();k++) {
			System.out.println(ar5.get(k));
		}
		
		ArrayList<Double>ar6=new ArrayList<Double>();
		
		ArrayList<E>ar7=new ArrayList<E>();
		
		Employee1 e1=new Employee1("Naveen",27,"QA");
		Employee1 e2=new Employee1("Peter",28,"Dev");
		Employee1 e3=new Employee1("Tom",29,"Admin");
		
		ArrayList<Employee1>ar8=new ArrayList<Employee1>();
		
		System.out.println("User Defined Objects inside the ArrayList");
		
		ar8.add(e1);
		ar8.add(e2);
		ar8.add(e3);
		
		
		Iterator<Employee1> it = ar8.iterator();
		
		while(it.hasNext()) {
			Employee1 emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		
		
		
		
		
	}

}
