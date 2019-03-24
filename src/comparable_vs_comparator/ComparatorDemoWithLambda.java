package comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorDemoWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i=0;i<100;i++){
			list.add(r.nextInt(1000));
		}
		
		//sorting by middle number
		Collections.sort(list, (i1, i2) ->{
				return i1 % 100 > i2 % 100 ? 1 : i2 % 100 > i1 % 100 ? -1 : 0;
			}
			
		);
		
		
		for(int j: list)
			System.out.println(j);

	}

}
