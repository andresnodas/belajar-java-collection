package programmer.zaman.now.collection;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		
		Stack<String> names = new Stack<>();
		names.push("Andres");
		names.push("Nodas");
		
		for(String name = names.pop(); name != null; name = names.pop())
			System.out.println(name);
		
	}
	
}
