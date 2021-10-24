package abstractStuff;

/**
 * Models a 'device' in the Distribution Center
 * An abstract class cannot be instantiated
 * All the properties and methods common ALL devices should be here.
 */
public abstract class Device {
    private String modelNumber;
    private String manufacturer;

    public abstract void turnOn();
    
    @Override
    public String toString() {
        return "Device [manufacturer=" + manufacturer + ", modelNumber=" + modelNumber + "]";
    }
}