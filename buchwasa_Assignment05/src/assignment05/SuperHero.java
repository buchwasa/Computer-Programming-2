package assignment05;

public abstract class SuperHero {
	private String alias;
	private String superPower;
	private boolean isAvenging;
	private String whatToAvenge;

	public SuperHero(String alias, String superPower, String whatToAvenge) {
		this.alias = alias;
		this.superPower = superPower;
		this.whatToAvenge = whatToAvenge;
		this.isAvenging = false;
	}

	/**
	 * Prints who the SuperHero is avenging
	 */
	public abstract void Avenge();

	/**
	 * Returns the real name of a SuperHero
	 * 
	 * @return The Real name
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Sets the real name of a SuperHero
	 * 
	 * @param alias The real name
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Gets the main superpower of a SuperHero
	 * 
	 * @return The superpower
	 */
	public String getSuperPower() {
		return superPower;
	}

	/**
	 * Sets the main superpower of a SuperHero
	 * 
	 * @param superPower The superpower of a SuperHero
	 */
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	/**
	 * Returns true if the SuperHero is presently avenging someone
	 * 
	 * @return Whether the SuperHero is avenging someone
	 */
	public boolean isAvenging() {
		return isAvenging;
	}

	/**
	 * Sets whether or not the SuperHero is avenging someone
	 * 
	 * @param isAvenging Set true if the superhero is avenging someone
	 */
	public void setAvenging(boolean isAvenging) {
		this.isAvenging = isAvenging;
	}

	/**
	 * Returns what the SuperHero is avenging
	 * 
	 * @return What the SuperHero is avenging
	 */
	public String getWhatToAvenge() {
		return whatToAvenge;
	}

	/**
	 * Sets what the SuperHero is avenging
	 * 
	 * @param whatToAvenge What the SuperHero is avenging
	 */
	public void setWhatToAvenge(String whatToAvenge) {
		this.whatToAvenge = whatToAvenge;
	}

	@Override
	public String toString() {
		return "SuperHero [alias=" + alias + ", superPower=" + superPower + ", isAvenging=" + isAvenging
				+ ", whatToAvenge=" + whatToAvenge + "]";
	}
}
