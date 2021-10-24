package assignment02;

public class Hobby {
    private String hobbyName;
    private double hobbyCost;
    private double timeSpentPerWeek;

    public Hobby(String hobbyName, double hobbyCost, double timeSpentPerWeek) {
        this.hobbyName = hobbyName;
        this.hobbyCost = hobbyCost;
        this.timeSpentPerWeek = timeSpentPerWeek;
    }

    /**
     * Gets the hobby name
     * 
     * @return The hobby name
     */
    public String getHobbyName() {
        return hobbyName;
    }

    /**
     * Sets the hobby name
     * 
     * @param hobbyName The hobby name
     */
    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    /**
     * Gets the cost of the hobby
     * 
     * @return The cost of the hobby
     */
    public double getHobbyCost() {
        return hobbyCost;
    }

    /**
     * Sets the cost of the hobby.
     * 
     * @param hobbyCost Cost of the hobby
     */
    public void setHobbyCost(double hobbyCost) {
        this.hobbyCost = hobbyCost;
    }

    /**
     * Gets the time spent per week in hours.
     * 
     * @return The time spent per week in hours
     */
    public double getTimeSpentPerWeek() {
        return timeSpentPerWeek;
    }

    /**
     * Sets the total time spent per week on the hobby, in hours.
     * 
     * @param timeSpent The total time spent per week, in hours
     */
    public void setTimeSpentPerWeek(int timeSpent) {
        this.timeSpentPerWeek = timeSpent;
    }

    /**
     * Returns the average time spent a day on the hobby.
     * 
     * @return
     */
    public double computeTimeSpentAverage() {
        return timeSpentPerWeek / 7;
    }

    /**
     * Outputs all of the methods
     * 
     * @return A string of all methods together
     */
    public String toString() {
        return hobbyName + " " + hobbyCost + " " + timeSpentPerWeek + " " + computeTimeSpentAverage();
    }
}
