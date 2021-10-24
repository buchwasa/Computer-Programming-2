package assignment05;

public class Batman extends SuperHero {
	private double maxSpeedOfBatmobile;
	
	public Batman(String alias, String superPower, String whatToAvenge) {
		super(alias, superPower, whatToAvenge);
	}

	/**
	 * Returns the max speed of the Batmobile
	 * 
	 * @return The max speed of the Batmobile
	 */
	public double getMaxSpeedOfBatmobile() {
		return maxSpeedOfBatmobile;
	}

	/**
	 * Sets the max speed of the Batmobile
	 * 
	 * @param maxSpeedOfBatmobile The max speed of the Batmobile
	 */
	public void setMaxSpeedOfBatmobile(double maxSpeedOfBatmobile) {
		this.maxSpeedOfBatmobile = maxSpeedOfBatmobile;
	}

	@Override
	public void Avenge() {
		System.out.println("Batman is avenging " + this.getWhatToAvenge());
	}
	
	public String toString() {
		return "Batman [maxSpeedOfBatmobile=" + maxSpeedOfBatmobile + "]";
	}
}
