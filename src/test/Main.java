package test;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Person> persons = new LinkedList<Person>();
		
		persons.add(new Male("Bobby", 48));
		persons.add(new Male("Brian", 28));
		persons.add(new Female("Sarah", 35));
		persons.add(new Female("Tone", 32));
		persons.add(new Dwarf("Gimli", 150));
		
		personInformation(persons);

	}
	
	public static void personInformation(LinkedList<Person> persons) {
		for(Person p : persons) {
			p.getInfo();
			p.doStuff();
		}
	}

}
