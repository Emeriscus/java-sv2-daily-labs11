package day02;

public class GpsCoordinates {
    private double latitude;
    private double longitude;
    private double heights;

    public GpsCoordinates(double latitude, double longitude, double heights) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.heights = heights;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getHeights() {
        return heights;
    }
}
