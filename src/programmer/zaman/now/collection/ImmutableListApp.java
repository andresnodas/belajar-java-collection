package programmer.zaman.now.collection;

import java.util.List;

public class ImmutableListApp {

	public static void main(String[] args) {
		
		List<String> names = List.of("Andres", "Nodas");
		
		names.set(0, "Ups"); //Error
		names.remove("Andres"); //Error
		names.add("Programmer"); //Error
		
	}
	
}
