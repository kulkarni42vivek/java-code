package Collections;
import java.util.* ; 

public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(25);
		pq.offer(65);
		pq.offer(89);
		pq.offer(45);
		pq.offer(11);
		
		System.out.println(pq.toString());
		System.out.println(pq.peek());
		
		pq.isEmpty();
		pq.contains(2);
		pq.poll();
		
	}
}
