public class Laptop extends Computer {

    int batteryTiming; // in hours

    public Laptop(String model, String manfacturer, int batteryTiming) {
        super(model, manfacturer);
        this.batteryTiming = batteryTiming;
    }

    public int getBatteryTiming() {
        return batteryTiming;
    }

    public void setBatteryTiming(int batteryTiming) {
        this.batteryTiming = batteryTiming;
    }
}
