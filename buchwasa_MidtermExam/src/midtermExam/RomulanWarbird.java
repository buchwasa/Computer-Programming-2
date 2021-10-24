package midtermExam;

public class RomulanWarbird extends StarShip {
	private String namedAfter;
	
	public RomulanWarbird(String namedAfter) {
		super();
		this.namedAfter = namedAfter;
	}

	/**
	 * {@inheritDoc}
	 */
	public String namedAfter() {
		return namedAfter;
	}

	/**
	 * Sets what the ship is named after.
	 * 
	 * @param namedAfter
	 */
	public void setNamedAfter(String namedAfter) {
		this.namedAfter = namedAfter;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean canSelfDestruct() {
		return true;
	}
}
