package buchwasa_Assignment00;

/**
 * This class solves Project Euler Problem 001
 * 
 * @author Drew
 *
 */
public class ProjectEulerProblem001 {

	/**
	 * Solves the problem from ProjectEuler.net Problem 001
	 * 
	 * @return The answer to the problem
	 */
	public static int solve() {
		int sum = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return sum;
	}
}
