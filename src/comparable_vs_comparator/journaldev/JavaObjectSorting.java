/**
 * 
 */
package comparable_vs_comparator.journaldev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hbhattac
 *
 */
public class JavaObjectSorting {

	/**
	 * This class shows how to sort primitive arrays, 
     * Wrapper classes Object Arrays
	 */
	public static void main(String[] args) {
		//sort primitives array like int array
		int[] arr = {5,9,1,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//sorting String array
        String[] strArr = {"A", "C", "B", "Z", "a", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        
      //sorting list of objects of Wrapper classes
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strArr));
        Collections.sort(list);
        System.out.println(list);
	}

}
