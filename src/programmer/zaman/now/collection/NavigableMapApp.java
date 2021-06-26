package programmer.zaman.now.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {

	public static void main(String[] args) {
		
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("Nodas", "Nodas");
		map.put("Andres", "Andres");
		map.put("Joko", "Joko");
		
		System.out.println(Arrays.toString(map.keySet().toArray()));
		
		System.out.println(map.lowerKey("Joko")); //Andres
		System.out.println(map.higherKey("Joko")); //Nodas
		
		NavigableMap<String, String> mapDesc = map.descendingMap();
		
		System.out.println(Arrays.toString(mapDesc.keySet().toArray()));
		//[Nodas, Joko, Andres]
		
		NavigableMap<String, String> empty = Collections.emptyNavigableMap();
		NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
		
		immutable.put("test", "test"); //Error
		
	}
	
}
