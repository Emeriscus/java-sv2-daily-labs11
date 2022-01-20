package day02;

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    private List<GpsCoordinates> gpsCoordinates = new ArrayList<>();

    public Hiking(List<GpsCoordinates> gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    public List<GpsCoordinates> getGpsCoordinates() {
        return gpsCoordinates;
    }

    private List<Double> getHeights(List<GpsCoordinates> gpsCoordinates) {
        List<Double> heihts = new ArrayList<>();
        for (GpsCoordinates actual : gpsCoordinates) {
            heihts.add(actual.getHeights());
        }
        return heihts;
    }

    public double getPlusElevation(List<GpsCoordinates> gpsCoordinates) {

        List<Double> heights = getHeights(gpsCoordinates);
        double result = 0;
        for (int i = 0; i < heights.size() - 1; i++) {
            if (heights.get(i + 1) > heights.get(i)) {
                result += heights.get(i + 1) - heights.get(i);
            }
        }
        return result;
    }
}
