package exercises;

public class Sistema {
    private int androidVersion;
    private int batteryTime;

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public int getBatteryTime() {
        return batteryTime;
    }

    public void setBatteryTime(int batteryTime) {
        this.batteryTime = batteryTime;
    }

    public Sistema(int androidVersion, int batteryTime) {
        this.androidVersion = androidVersion;
        this.batteryTime = batteryTime;
    }
}
