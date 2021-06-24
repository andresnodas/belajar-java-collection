package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("firstName", "Andres");
		map.put("lastName", "Nodas");
		
		System.out.println(map.get("firstName"));
		System.out.println(map.get("lastName"));
		
	}
	
}
