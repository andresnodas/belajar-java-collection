package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

	public static void main(String[] args) {
		
		Collection<String> names = new ArrayList<>();
		names.add("Andres");
		names.add("Nodas");
		
		names.addAll(List.of("Programmer", "Zaman", "Now"));
		
		names.remove("Nodas");
		names.removeAll(List.of("Zaman", "Programmer"));
		
		System.out.println(names.contains("Andres"));
		System.out.println(names.containsAll(List.of("Now", "Nodas")));
		
		for(String name : names)
		{
			System.out.println(name);
		}
	}
	
}
