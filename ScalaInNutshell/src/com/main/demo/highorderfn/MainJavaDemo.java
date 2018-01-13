package com.main.demo.highorderfn;

import java.util.ArrayList;
import java.util.List;

public class MainJavaDemo {

	public static void main(String[] args) {
		List<Person>people = new ArrayList<Person>();

		people.add(new Person("Mr. A", 18));
		people.add(new Person("Mr. B", 17));
		people.add(new Person("Mr. C", 25));
		
		List<Person>minors = new ArrayList<Person>(people.size());
				
		List<Person>adults = new ArrayList<Person>(people.size());
				
		for (Person person : people) {
			if(person.age() < 18) {
				minors.add(person);
			}else {
				adults.add(person);
			}
		}
		
		for (Person person : minors) {
			System.out.println("Minor: "+person.name());
		}
		
		for (Person person : adults) {
			System.out.println("Adult: "+person.name());
		}

	}

}
