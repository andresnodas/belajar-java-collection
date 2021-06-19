package programmer.zaman.now.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

	public static void main(String[] args) {
		
		Iterable<String> names = List.of("Eko", "Kurniawan", "Khannedy");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("Iterator");
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
