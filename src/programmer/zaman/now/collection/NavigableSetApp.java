package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

	public static void main(String[] args) {
		
		NavigableSet<String> names = new TreeSet<>();
		names.addAll(Set.of("Andres", "Nodas", "Programmer", "Zaman", "Now"));
		
		NavigableSet<String> namesDesc = names.descendingSet();
		NavigableSet<String> nodas = names.headSet("Nodas", true);
		
		for(String name : nodas) {
			System.out.println(name);
		}
		
		NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
		immutable.add("ups"); //Error
		
	}
	
}
