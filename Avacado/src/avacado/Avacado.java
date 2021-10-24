package avacado;

/**
 * Models an avacado at Kroger for sale
 * 
 * @author Drew
 *
 */
public class Avacado {
	private double price;
	private String color;

	public Avacado() {
		System.out.println("Avacado constructor");

		this.price = 0;
		this.color = "Unknown";
	}

	/**
	 * Gets the price of the avacado
	 * 
	 * @return
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets the price of the avacado
	 * 
	 * @param price
	 * @throws Exception
	 */
	public void setPrice(double price) throws Exception {
		if (price < 0) {
			throw new Exception("Price cannot be negative");
		}

		this.price = price;
	}

	/**
	 * Gets the color of the avacado
	 * 
	 * @return
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Sets the color of the avacado
	 * 
	 * @param color
	 * @throws Exception
	 */
	public void setColor(String color) throws Exception {
		if (color.length() == 0) {
			throw new Exception("Color cannot be empty");
		}

		this.color = color;
	}
}
