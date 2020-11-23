package com.deliton.main;

import com.deliton.vo.SatelliteClass;

public class Main {

    public static void main(String[] args) {
        SatelliteClass satellite = new SatelliteClass();

        // Connect to a valid satellite and valid frequency
        satellite.establishConnection("ETHEREUM", 4651, "SIMPLE");

        // Connect to a protected satellite with valid frequency
        satellite.establishConnection("GPS", 4651, "SIMPLE");

        //Connect to a valid satellite with invalid frequency
        satellite.establishConnection("ETHEREUM", 40, "SIMPLE");
    }
}
