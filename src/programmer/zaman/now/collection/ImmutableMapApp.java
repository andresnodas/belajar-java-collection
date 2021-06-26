package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {

	public static void main(String[] args) {
		
		Map<String, String> empty = Collections.emptyMap();
		Map<String, String> singleton = Collections.singletonMap("name", "Andres");
		
		Map<String, String> mutable = new HashMap<>();
		mutable.put("name", "Andres");
		Map<String, String> immutable = Collections.unmodifiableMap(mutable);
		
		Map<String, String> map = Map.of(
			"first", "Andres",
			"last", "Nodas"
		);
		
		map.put("fullName", "Andres Nodas"); //Error
		
	}
	
}
