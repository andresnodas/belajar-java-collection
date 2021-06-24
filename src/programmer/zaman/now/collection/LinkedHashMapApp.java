package programmer.zaman.now.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		map.put("last", "Nodas");
		map.put("first", "Andres");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
	}
	
}
