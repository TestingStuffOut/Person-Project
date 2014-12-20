package test;

public class Attack {
	
	private String attackType;
	private int damagde;
	
	public Attack(String attackType, int damage) {
		this.attackType = attackType;
		this.damagde = damagde;
	}

	public void doAttack() {
		System.out.println("attacks with " + attackType + " for " + damagde + " damgde");
	}
}
