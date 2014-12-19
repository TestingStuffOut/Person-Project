package test;

public class Male extends Person {

	public Male(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void doStuff() {
		System.out.println("Burbs loudly and farts");
	}

}
