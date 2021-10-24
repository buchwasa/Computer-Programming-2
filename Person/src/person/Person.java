package person;

import java.util.ArrayList;

/**
 * Models a person who attends UC
 * 
 * @author Drew
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private ArrayList<String> classes = new ArrayList<String>();

	public void addClass(String newClass) {
		classes.add(newClass);
	}

	/**
	 * Gets the first name of a person
	 * 
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name of a person
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of a person
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name of a person
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns a string representation of the current object.
	 * 
	 * @return a string
	 */
	public String toString() {
		return firstName + " " + lastName + ": " + classes.toString();
	}
}
