package programmer.zaman.now.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {

	public static void main(String[] args) {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		Spliterator<String> spliterator1 = names.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		
		System.out.println(spliterator1.estimateSize());
		System.out.println(spliterator2.estimateSize());
		
		spliterator1.forEachRemaining(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		spliterator2.forEachRemaining(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}
	
}
