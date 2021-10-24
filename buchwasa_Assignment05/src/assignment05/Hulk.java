package assignment05;

public class Hulk extends SuperHero {
	private double clothesBudget;

	public Hulk(String alias, String superPower, String whatToAvenge) {
		super(alias, superPower, whatToAvenge);
	}
	
	/**
	 * Gets the clothes budget of the Hulk object
	 * 
	 * @return The clothes budget
	 */
	public double getClothesBudget() {
		return clothesBudget;
	}

	/**
	 * Sets the clothes budget of the Hulk object
	 * 
	 * @param clothesBudget The clothes budget to 2 decimals
	 */
	public void setClothesBudget(double clothesBudget) {
		this.clothesBudget = clothesBudget;
	}

	@Override
	public void Avenge() {
		System.out.println("Hulk is avenging " + this.getWhatToAvenge());
	}

	@Override
	public String toString() {
		return "Hulk [clothesBudget=" + clothesBudget + "]";
	}
	
}
