package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

	public static void main(String[] args) {
		
		Deque<String> stack = new LinkedList<>();
		
		stack.offerLast("Andres");
		stack.offerLast("Nodas");
		
		for(String name = stack.pollLast(); name != null; name = stack.pollLast())
			System.out.println(name);
		
		Deque<String> queue = new LinkedList<>();
		queue.offerLast("Andres");
		queue.offerLast("Nodas");
		
		for(String name = queue.pollFirst(); name != null; name = queue.pollFirst())
			System.out.println(name);
		
	}
	
}
