package buchwasa_Assignment01;

/**
 * This class solves ProjectEuler.net problem 005.
 * 
 * @author Drew
 *
 */
public class ProjectEulerProblem005 {

	/**
	 * This function solves project euler problem 005
	 * 
	 * @return
	 */
	public int solve() {
		int number = 1;
		while (true) {
			boolean hasRemainder = false;
			for (int i = 1; i <= 20; i++) {
				if (number % i != 0) {
					hasRemainder = true;
				}
			}

			if (!hasRemainder) {
				break;
			}

			number++;
		}

		return number;
	}
}
