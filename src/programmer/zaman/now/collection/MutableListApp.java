package programmer.zaman.now.collection;

import java.util.List;

import programmer.zaman.now.collection.data.Person;

public class MutableListApp {

	public static void main(String[] args) {
		
		Person person = new Person("Andres");
		person.addHobby("Berenang");
		person.addHobby("Lari");
		
		doSomethingWithHobbies(person.getHobbies());
		
		for(String hobby : person.getHobbies())
			System.out.println(hobby);
		
	}
	
	public static void doSomethingWithHobbies(List<String> hobbies) {
		hobbies.add("Bukan Hobby");
	}
	
}
