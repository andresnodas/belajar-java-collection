package programmer.zaman.now.collection;

import java.util.Queue;

import programmer.zaman.now.collection.collection.SingleQueue;

public class SingleQueueApp {

	public static void main(String[] args) {
		
		Queue<String> queue = new SingleQueue<>();
		queue.offer("Andres");
		queue.offer("Nodas");
		
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
	}
	
}
