package superBowlCommercial;

public class SuperBowlCommercial {
    private String sponsorName;
    private double costToRun;
    private int timesRun;
    private String productName;
    private boolean isBlackAndWhite;
    private static String cameraModel;

     /**
     * Init a superbowl class object
     * 
     * @param sponsorName
     * @param costToRun
     * @param productName
     * @param isBlackAndWhite
     */
    public SuperBowlCommercial(String sponsorName, double costToRun, String productName, boolean isBlackAndWhite) {
        this.sponsorName = sponsorName;
        this.costToRun = costToRun;
        this.productName = productName;
        this.isBlackAndWhite = isBlackAndWhite;
    }

    /**
     * Init a superbowl class object
     * 
     * @param sponsorName
     * @param costToRun
     * @param productName
     */
    public SuperBowlCommercial(String sponsorName, double costToRun, String productName) {
        this.sponsorName = sponsorName;
        this.costToRun = costToRun;
        this.productName = productName;
    }

    /**
     * Default constructor, does nothing
     */
    public SuperBowlCommercial() {}

    /**
     * Gets the name of the sponsor
     * 
     * @return the sponsor name
     */
    public String getSponsorName() {
        return this.sponsorName;
    }

    /**
     * Sets the sponsor name
     * 
     * @param sponsorName
     * @throws Exception
     */
    public void setSponsorName(String sponsorName) throws Exception {
        if (sponsorName.trim().length() == 0) {
            throw new Exception("Sponsor name cannot be empty");
        }

        this.sponsorName = sponsorName;
    }

    /**
     * Gets the cost to run
     * 
     * @return
     */
    public double getCostToRun() {
        return this.costToRun;
    }

    /**
     * Sets the cost to run
     * 
     * @param costToRun
     * @throws Exception
     */
    public void setCostToRun(double costToRun) throws Exception {
        if (costToRun < 0) {
            throw new Exception("Cost to run cannot be negative");
        }

        this.costToRun = costToRun;
    }

    public void runOneTime() {
        this.timesRun++;
    }

    public int getTimesRun() {
        return timesRun;
    }

    public void setTimesRun(int timesRun) {
        this.timesRun = timesRun;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Returns true if the commercial is in black and white.
     */
    public boolean isBlackAndWhite() {
        return isBlackAndWhite;
    }

    /**
     * Sets the commercial in black and white if true
     * 
     * @param isBlackAndWhite if it is or isn't in black and white
     */
    public void setBlackAndWhite(boolean isBlackAndWhite) {
        this.isBlackAndWhite = isBlackAndWhite;
    }

    /**
     * Gets the camera model that is used for all instances of this class
     * 
     * @return the camera model
     */
    public static String getCameraModel() {
        return cameraModel;
    }

     /**
     * Sets the camera model
     * 
     * @param cameraModel the model to use
     */
    public static void setCameraModel(String cameraModel) {
        SuperBowlCommercial.cameraModel = cameraModel;
    }

    @Override
    public String toString() {
        return "SuperBowlCommercial [costToRun=" + costToRun + ", isBlackAndWhite=" + isBlackAndWhite + ", productName="
                + productName + ", sponsorName=" + sponsorName + ", timesRun=" + timesRun + "]";
    }
}
