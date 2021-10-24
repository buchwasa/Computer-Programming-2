package midtermExam;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<StarShip> starships = new ArrayList<StarShip>();
		starships.add(new RomulanWarbird("Warbirds"));
		starships.add(new KilingonBirdofPrey("Birds"));
		starships.add(new FederationCentaur("Centaurs"));
		
		for (StarShip starship : starships) {
			System.out.println(starship.getClass().getName());
			System.out.println("Named after: " + starship.namedAfter());
			System.out.println("Can it self destruct: " + starship.canSelfDestruct());
		}
	}
}
