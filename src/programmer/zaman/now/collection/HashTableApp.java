package programmer.zaman.now.collection;

import java.util.Hashtable;

public class HashTableApp {

	public static void main(String[] args) {
		
		Hashtable<String, String> names = new Hashtable<>();
		names.put("Andres", "Andres");
		names.put("Nodas", "Nodas");
		
		for(String key : names.keySet())
			System.out.println(key + " : " + names.get(key));
		
	}
	
}
