package assignment04;

public class Main {
    
    public static void main(String[] args) {
        BreakfastFood breakfastFood = new BreakfastFood(0, true);
        PopTart popTart = new PopTart(10, false, "Dirt", true);
        WholeWheatPopTart wholeWheatPopTart = new WholeWheatPopTart(5, false, "Literally Wheat", true, true, false);

        System.out.println("BreakfastFood " + breakfastFood.toString());
        System.out.println("PopTart " + popTart.toString());
        System.out.println("WholeWheatPopTart " + wholeWheatPopTart.toString());
    }
}