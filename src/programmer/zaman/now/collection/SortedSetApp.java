package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

public class SortedSetApp {

	public static void main(String[] args) {
		
		SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
		people.add(new Person("Eko"));
		people.add(new Person("Budi"));
		people.add(new Person("Joko"));
		
		for(Person person : people)
			System.out.println(person.getName());
		
		SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
		sortedSet.add(new Person("Andres")); // Error
		
	}
	
}
