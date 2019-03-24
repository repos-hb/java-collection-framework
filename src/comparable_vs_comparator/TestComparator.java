package comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> scomp = new StringCompare();
		
		String arr[] = {"Hello", "Hi", "HI", "hello"};
		
		//using the Comparable defined in the String class
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//using the customized Comparator 
		Arrays.sort(arr, scomp);
		System.out.println(Arrays.toString(arr));
		
		
		Comparator<Integer> icomp = new IntegerCompare();
		List<Integer> l = new ArrayList<>();
		l.add(42);
		l.add(21);
		l.add(34);
		l.add(13);
		
		Collections.sort(l, icomp);
		System.out.println(l);
		
	}

}
