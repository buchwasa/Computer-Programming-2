package assignment03;

public class SuperSmashBrothersMeleeCharacter {
    String characterName;
    int weight;
    double fallingSpeed;
    double airSpeed;
    double size;
    double dashSpeed;

    public SuperSmashBrothersMeleeCharacter(String characterName, int weight, double fallingSpeed, double airSpeed,
            double size, double dashSpeed) {
        this.characterName = characterName;
        this.weight = weight;
        this.fallingSpeed = fallingSpeed;
        this.airSpeed = airSpeed;
        this.size = size;
        this.dashSpeed = dashSpeed;
    }

    public SuperSmashBrothersMeleeCharacter() {
        this.characterName = "";
        this.weight = 0;
        this.fallingSpeed = 0.0;
        this.airSpeed = 0.0;
        this.size = 0.0;
        this.dashSpeed = 0.0;
    }

    /**
     * Gets the name of the character
     * 
     * @return Character name
     */
    public String getCharacterName() {
        return characterName;
    }

    /**
     * Sets the name of a character
     * 
     * @param characterName the name of the character
     */
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    /**
     * Gets the weight of the character in NTSC
     * 
     * @return Character weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the character in NTSC
     * 
     * @param weight The weight of the character
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the speed that a character falls
     * 
     * @return The falling speed
     */
    public double getFallingSpeed() {
        return fallingSpeed;
    }

    /**
     * Sets the speed at which a character falls
     * 
     * @param fallingSpeed The falling speed
     */
    public void setFallingSpeed(double fallingSpeed) {
        this.fallingSpeed = fallingSpeed;
    }

    /**
     * Gets the air speed of a character in NTSC
     * 
     * @return The air speed
     */
    public double getAirSpeed() {
        return airSpeed;
    }

    /**
     * Sets the air speed of a character in NTSC
     * 
     * @param airSpeed The air speed of the character
     */
    public void setAirSpeed(double airSpeed) {
        this.airSpeed = airSpeed;
    }

    /**
     * Gets the size of the character in feet
     * 
     * @return Character size in feet
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the character in feet
     * 
     * @param size Character size in feet
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Gets the speed that the character runs at
     * 
     * @return Dash speed of a character
     */
    public double getDashSpeed() {
        return dashSpeed;
    }

    /**
     * Sets the speed that the character runs at
     * 
     * @param dashSpeed The dash speed of the character
     */
    public void setDashSpeed(double dashSpeed) {
        this.dashSpeed = dashSpeed;
    }

    @Override
    public String toString() {
        return "SuperSmashBrothersMeleeCharacter [airSpeed=" + airSpeed + ", characterName=" + characterName
                + ", dashSpeed=" + dashSpeed + ", fallingSpeed=" + fallingSpeed + ", size=" + size + ", weight="
                + weight + "]";
    }
}
