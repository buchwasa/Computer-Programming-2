package assignment03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<SuperSmashBrothersMeleeCharacter> characters = new ArrayList<SuperSmashBrothersMeleeCharacter>();
        SuperSmashBrothersMeleeCharacter mario = new SuperSmashBrothersMeleeCharacter("Mario", 100, 1.7, 0.86, 5.15,
                1.5);
        SuperSmashBrothersMeleeCharacter mewtwo = new SuperSmashBrothersMeleeCharacter("Mewtwo", 85, 1.5, 1.2, 6.07,
                1.4);
        SuperSmashBrothersMeleeCharacter pichu = new SuperSmashBrothersMeleeCharacter("Pichu", 55, 1.9, 0.85, 1.0,
                1.72);
        SuperSmashBrothersMeleeCharacter jigglypuff = new SuperSmashBrothersMeleeCharacter("Jigglypuff", 60, 1.3, 1.35,
                1.08, 1.1);
        SuperSmashBrothersMeleeCharacter kirby = new SuperSmashBrothersMeleeCharacter("Kirby", 70, 1.6, 0.78, 0.8, 1.4);
        characters.add(mario);
        characters.add(mewtwo);
        characters.add(pichu);
        characters.add(jigglypuff);
        characters.add(kirby);

        for (SuperSmashBrothersMeleeCharacter character : characters) {
            System.out.println(character.toString());
        }
    }
}