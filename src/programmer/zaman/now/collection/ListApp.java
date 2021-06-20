package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		List<String> linkedListNames = new LinkedList<>();
		
		names.add("Andres");
		names.add("Nodas");
		linkedListNames.add("Andres");
		linkedListNames.add("Nodas");
		
		names.set(0, "Programmer");
		linkedListNames.set(0, "Zaman");
		
		System.out.println(names.get(0));
		System.out.println(linkedListNames.get(0));
		
	}
	
}
