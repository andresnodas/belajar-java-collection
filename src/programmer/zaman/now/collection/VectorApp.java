package programmer.zaman.now.collection;

import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<>();
		names.add("Andres");
		names.add("Nodas");
		
		for(String name : names)
			System.out.println(name);
		
		
	}
	
}
