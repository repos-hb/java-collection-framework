package treemap;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * This example demonstrates how to create a TreeMap with a custom comparator that 
 * orders the TreeMap entries in the descending order of keys.
 */
public class CreateTreeMapCustomComparatorExample {

	public static void main(String[] args) {
		TreeMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
			
			@Override
			public int compare(String st1, String st2){
				return st2.compareTo(st1);
			}
		});

		fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");
        
        System.out.println(fileExtensions);
	}

}
