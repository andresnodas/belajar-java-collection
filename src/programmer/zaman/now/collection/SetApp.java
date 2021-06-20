package programmer.zaman.now.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {

//		Set<String> names = new HashSet<>();
		Set<String> names = new LinkedHashSet<String>();
		names.add("Andres");
		names.add("Nodas");
		names.add("Programmer");
		names.add("Zaman");
		names.add("Now");
		
		for(String name : names)
			System.out.println(name);
		
		/* Andres
		 * Nodas
		 * Programmer
		 * Zaman
		 * Now
		 * */
		
	}
	
}
