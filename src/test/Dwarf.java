package test;

public class Dwarf extends Person {

	public Dwarf(String name, int age) {
		super(name, age);
	}

	@Override
	public void doStuff() {
		System.out.println("I like to bash people");	
	}
	
	@Override
	public void getInfo() {
		System.out.println("No info on dwarves");
	}

}
