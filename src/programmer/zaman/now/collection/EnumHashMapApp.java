package programmer.zaman.now.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

	public static enum Level {
		FREE, STANDARD, PREMIUM, VIP
	}
	
	public static void main(String[] args) {
		
		Map<Level, String> map = new EnumMap<>(Level.class);
		map.put(Level.FREE, "Andres");
		map.put(Level.VIP, "Nodas");
		
		for(Level key : map.keySet())
			System.out.println(key);
		
		
	}
	
}
