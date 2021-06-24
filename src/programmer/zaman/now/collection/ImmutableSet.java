package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {

	public static void main(String[] args) {
		
		Set<String> empty = Collections.emptySet();
		Set<String> one = Collections.singleton("Andres");
		
		Set<String> names = new HashSet<>();
		names.add("Andres");
		names.add("Nodas");
		
		Set<String> immutableNames = Collections.unmodifiableSet(names);
		
		Set<String> set = Set.of("Andres", "Nodas");
		
		set.remove("Andres"); //Error
		
		
	}
	
}
