package comparable_vs_comparator;

import java.util.Comparator;

public class IntegerCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j){
		return i%10 - j%10;
	}
}
