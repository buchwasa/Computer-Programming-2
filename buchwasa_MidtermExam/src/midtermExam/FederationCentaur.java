package midtermExam;

public class FederationCentaur extends StarShip {
	private String namedAfter;
	
	public FederationCentaur(String namedAfter) {
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
	 * Sets what this ship is named after.
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
