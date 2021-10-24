package assignment05;

public class BlackWidow extends SuperHero {
	int speed;
	
	public BlackWidow(String alias, String superPower, String whatToAvenge) {
		super(alias, superPower, whatToAvenge);
	}

	/**
	 * Gets the speed of BlackWidow in feet per second
	 * 
	 * @return The speed in feet per second
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed of a Black Widow object in feet per second
	 * 
	 * @param speed The speed in feet per second
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void Avenge() {
		System.out.println("Black Widow is avenging " + this.getWhatToAvenge());
	}
	
	@Override
	public String toString() {
		return "BlackWidow [speed=" + speed + "]";
	}
}
