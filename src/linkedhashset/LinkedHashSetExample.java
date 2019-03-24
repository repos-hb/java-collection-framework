package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five"); 
        
        Iterator<String> itr = set.iterator();
        itr.forEachRemaining(s -> {
        	System.out.println(s);
        });

	}

}
