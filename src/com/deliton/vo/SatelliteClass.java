package com.deliton.vo;

import java.util.ArrayList;
import java.util.List;

public class SatelliteClass {

    public static final int MINIMUM_ALLOWED_FREQUENCY = 420;
    public static final int MAXIMUM_ALLOWED_FREQUENCY = 28800;

    public SatelliteClass() {

    }

    private static List<String> protectedSatellites;

    static {
        protectedSatellites = new ArrayList<String>();
        protectedSatellites.add("NOAA");
        protectedSatellites.add("GPS");
        protectedSatellites.add("GOES");
        protectedSatellites.add("STARLINK");
        protectedSatellites.add("GLONASS");
        protectedSatellites.add("BEIDOU");
    }

    public void establishConnection(String satelliteName, int frequency, String modulation) {
        if (frequency >= MINIMUM_ALLOWED_FREQUENCY && frequency <= MAXIMUM_ALLOWED_FREQUENCY) {
            if (protectedSatellites.contains(satelliteName.toUpperCase())) {
                System.out.println("ERROR CODE 02 - You're trying to upstream data to a protected satellite.");
            } else {
                System.out.println("Connecting to " + satelliteName);
                System.out.println("Using " + frequency + "hz frequency");
                System.out.println("Modulating radiowaves to " + modulation);
            }
        } else {
            System.out.println("ERROR CODE 01 - The only uplink frequencies allowed are between 420hz and 28800hz.");
        }
    }
}
