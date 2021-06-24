package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
		
		Queue<String> queue = new ArrayDeque<>();
		queue.offer("Andres");
		queue.offer("Nodas");
		
		for(String name = queue.poll(); name != null; name = queue.poll()) {
			System.out.println(name);
		}
		
		System.out.println(queue.size());
		
	}
	
}
