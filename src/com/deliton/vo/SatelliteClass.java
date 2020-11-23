package com.deliton.vo;

import com.deliton.interfaces.Satellite;

public class SatelliteClass implements Satellite {

    @Override
    public void establishConnection(String satelliteName, int frequency, String modulation) {
        System.out.println("Connecting to " + satelliteName);
        System.out.println("Using " + frequency + "hz frequency");
        System.out.println("Modulating radiowaves to " + modulation);
    }
}
