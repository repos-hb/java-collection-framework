package arraylists;

import java.util.*;

public class ArrayListFirstLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] aList = {10, 30, 20, 14, 2};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(aList));
		
		System.out.println("first: "+list.get(0));
		System.out.println("first: "+list.get(list.size()-1));
	}

}
