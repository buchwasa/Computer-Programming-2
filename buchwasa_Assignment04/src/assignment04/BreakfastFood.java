package assignment04;

public class BreakfastFood {
    private int totalCalories;
    private boolean glutenFree;

    public BreakfastFood(int totalCalories, boolean glutenFree) {
        this.totalCalories = totalCalories;
        this.glutenFree = glutenFree;
    }

    /**
     * Gets the total calorie count of a poptart
     * @return
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    /**
     * Sets the total calorie count of a poptart
     * @param totalCalories
     */
    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    /**
     * Returns whether or not the poptart contains gluten
     */
    public boolean isGlutenFree() {
        return glutenFree;
    }

    /**
     * Sets whether or not the poptart has gluten
     * @param glutenFree
     */
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return "glutenFree=" + glutenFree + ", totalCalories=" + totalCalories;
    }
}
