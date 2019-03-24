package arraylists.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class AlternateMinMax {

	public static void main(String[] args) {
		// input list 
        Integer arr[] = {1, 3, 8, 2, 7, 5, 6, 4}; 
          
        // convert array to LinkedList 
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(arr)); 
          
        // rearrange the given list 
        alternateSort(ll);
        
        for(Integer i:ll)
        	System.out.println(i+" ");

	}

	private static void alternateSort(LinkedList<Integer> ll) {
		Collections.sort(ll);
		
		for(int i=1;i<(ll.size()+1)/2;i++){
			Integer temp = ll.getLast();
			ll.removeLast();
			ll.add(2*i - 1, temp);
		}
		
	}

}
