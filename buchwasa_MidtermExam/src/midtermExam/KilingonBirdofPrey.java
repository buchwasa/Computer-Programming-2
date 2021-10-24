package midtermExam;

public class KilingonBirdofPrey extends StarShip{
	private String namedAfter;
	
	public KilingonBirdofPrey(String namedAfter) {
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
		return false;
	}
}
