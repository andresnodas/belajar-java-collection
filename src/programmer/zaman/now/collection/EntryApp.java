package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Andres", "Andres");
		map.put("Nodas", "Nodas");
		
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			System.out.println("====");
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		
	}
	
}
