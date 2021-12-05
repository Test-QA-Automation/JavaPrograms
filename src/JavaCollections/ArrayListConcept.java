package JavaCollections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add(null);
		arrayList.add("Hi");
		arrayList.add("This");
		arrayList.add("is");
		arrayList.add("an");
		arrayList.add("ArrayList");
		
		System.out.println(arrayList);
		
		arrayList.remove(0);
		
		System.out.println(arrayList);
		
		
				
	}

}
