package test;

public class Lesbian extends Person {

	private String hobby;
	
	public Lesbian(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}

	@Override
	public void doStuff() {
		System.out.println(super.getName() + " likes to do her hobby wich is " + hobby);
	}

}
