package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CompBasedPQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pq = new PriorityQueue<>(((i, j) -> {

			return i > j ? -1 : i < j ? 1 : 0;
		}));
		
		pq.add(11);
		pq.add(33);
		pq.add(19);
		pq.add(22);
		pq.add(10);
		
		pq.iterator().forEachRemaining(val -> {
			System.out.println(val);
		});

	}

}
