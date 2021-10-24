package assignment05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<SuperHero> superHeroes = new ArrayList<SuperHero>();
		Batman batman = new Batman("Bruce Wayne", "None", "his parents");
		Hulk hulk = new Hulk("Bruce Banner", "Transformation", "someone");
		BlackWidow blackWidow = new BlackWidow("Natalia Alianovna Romanova", "Artificially Enhanced Physiology", "someone");
		
		superHeroes.add(batman);
		superHeroes.add(hulk);
		superHeroes.add(blackWidow);
		
		for (SuperHero superHero : superHeroes) {
			superHero.Avenge();
		}
	}
}
