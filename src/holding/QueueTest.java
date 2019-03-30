package holding;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> queue=new LinkedList<String>();
		
		queue.offer("Hello");
		queue.offer("JAVA");
		queue.offer("Nice");
		queue.offer("To");
		queue.offer("Meet");
		queue.offer("You");
		queue.offer("!");
		
		//优先队列按照自己的默认顺序排序
		PriorityQueue<String> priorityQueue=
				new PriorityQueue<String>(queue);
		
		while(queue.peek()!=null) {
			System.out.println(queue.remove());
		}
		
		System.out.println(queue);
		
		while(priorityQueue.peek()!=null) {
			System.out.println(priorityQueue.remove());
		}
		
		
	}
	
	
}
