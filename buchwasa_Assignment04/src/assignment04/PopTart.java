package assignment04;

public class PopTart extends BreakfastFood {
    private String flavor;
    private boolean isFrosted;

    public PopTart(int totalCalories, boolean glutenFree, String flavor, boolean isFrosted) {
        super(totalCalories, glutenFree);
        this.flavor = flavor;
        this.isFrosted = isFrosted;
    }

    /**
     * Gets the flavor of the poptart
     * @return
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the flavor of the poptart
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Returns whether or not the poptart is frosted
     * @return
     */
    public boolean isFrosted() {
        return isFrosted;
    }

    /**
     * Sets whether or not the poptart is frosted
     * @param isFrosted
     */
    public void setFrosted(boolean isFrosted) {
        this.isFrosted = isFrosted;
    }

    @Override
    public String toString() {
        String parent = (new BreakfastFood(this.getTotalCalories(), this.isGlutenFree())).toString();
        return parent + ", flavor=" + flavor + ", isFrosted=" + isFrosted;
    }
}
