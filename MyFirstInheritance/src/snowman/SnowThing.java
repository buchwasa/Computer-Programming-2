package snowman;

public class SnowThing {
    private String snow;

    public SnowThing(String snow) {
        setSnow(snow);
        //this.snow = snow; Bypasses setSnow()
    }

    public String getSnow() {
        return snow;
    }

    public void setSnow(String snow) {
        this.snow = snow;
    }
}
