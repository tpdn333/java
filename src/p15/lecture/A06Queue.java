package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		// FIFO Frist In Frist Out
		q1.offer(9);
		q1.offer(8);
		q1.offer(7);
		
		q1.poll();
		
		System.out.println(q1);
		System.out.println(q1.peek());
	}
}
