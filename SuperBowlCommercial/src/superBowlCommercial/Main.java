package superBowlCommercial;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SuperBowlCommercial crystalPepsi;
        crystalPepsi = new SuperBowlCommercial("Pepsi", 1_000_000.00, "Crystal Pepsi");

        SuperBowlCommercial unknown;
        unknown = new SuperBowlCommercial();

        SuperBowlCommercial.setCameraModel("Nikon XYZ Super Mega Sports");
        System.out.println(SuperBowlCommercial.getCameraModel());

        ArrayList<SuperBowlCommercial> commercials = null;
        commercials = new ArrayList<SuperBowlCommercial>();
        commercials.add(crystalPepsi);

        SuperBowlCommercial ketchup;
        ketchup = new SuperBowlCommercial("Heinz", 2_000_000.00, "Heinz Ketchup");
        commercials.add(ketchup);
        
        System.out.println(commercials.toString());
        
        for (SuperBowlCommercial sbc : commercials) {
            System.out.println(sbc.toString());
        }

        System.out.printf("There are %s commercials\n", commercials.size());
    }
}
