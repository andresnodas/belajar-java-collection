package programmer.zaman.now.collection;

import java.util.EnumSet;

import programmer.zaman.now.collection.data.Gender;

public class EnumSetApp {

	public static void main(String[] args) {
		
//		EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
		
		EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
		
		for(Gender gender : genders)
			System.out.println(gender);
		
	}
	
}
