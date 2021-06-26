package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.addAll(List.of("Andres", "Nodas", "Programmer", "Zaman", "Now"));
		System.out.println(names); //[Andres, Nodas, Programmer, Zaman, Now]
		
		Collections.reverse(names);
		System.out.println(names); //[Now, Zaman, Programmer, Nodas, Andres]
		
		Collections.shuffle(names);
		System.out.println(names); //[Zaman, Nodas, Programmer, Andres, Now]
	}
	
}
