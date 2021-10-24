package assignment04;

public class WholeWheatPopTart extends PopTart {
    private boolean hasSprinkles;
    private boolean hasSugar;

    public WholeWheatPopTart(int totalCalories, boolean glutenFree, String flavor, boolean isFrosted,
            boolean hasSprinkles, boolean hasSugar) {
        super(totalCalories, glutenFree, flavor, isFrosted);
        this.hasSprinkles = hasSprinkles;
        this.hasSugar = hasSugar;
    }

    /**
     * Returns if the poptart has sprinkles on it
     * @return
     */
    public boolean hasSprinkles() {
        return hasSprinkles;
    }

    /**
     * Sets whether or not the poptart has sprinkles
     * @param hasSprinkles
     */
    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    /**
     * Returns whether or not the poptart has sugar
     * @return
     */
    public boolean hasSugar() {
        return hasSugar;
    }

    /**
     * Sets whether or not the poptart has sugar
     * @param hasSugar
     */
    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public String toString() {
        String parent = (new PopTart(this.getTotalCalories(), this.isGlutenFree(), this.getFlavor(), this.isFrosted())).toString();
        return parent + ", hasSprinkles=" + hasSprinkles + ", hasSugar=" + hasSugar;
    }
}
