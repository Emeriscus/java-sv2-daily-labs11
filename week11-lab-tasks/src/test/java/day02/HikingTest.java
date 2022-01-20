package day02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    List<GpsCoordinates> gpsCoordinates = Arrays.asList(new GpsCoordinates(100.0, 150.0, 350.0),
            new GpsCoordinates(100.0, 150.0, 352.0), new GpsCoordinates(100.0, 150.0, 348.0),
            new GpsCoordinates(100.0, 150.0, 358.0), new GpsCoordinates(100.0, 150.0, 360.0));

    Hiking hiking = new Hiking(gpsCoordinates);

    @Test
    void getPlusElevationTest() {
        assertEquals(14, hiking.getPlusElevation(gpsCoordinates));
    }
}