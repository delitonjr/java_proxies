package com.deliton.main;

import com.deliton.interfaces.Satellite;
import com.deliton.vo.ProxySatellite;

public class Main {

    public static void main(String[] args) {
        Satellite satellite = new ProxySatellite();

        // Connect to a valid satellite and valid frequency
        satellite.establishConnection("ETHEREUM", 4651, "SIMPLE");

        // Connect to a protected satellite with valid frequency
        satellite.establishConnection("GPS", 4651, "SIMPLE");

        //Connect to a valid satellite with invalid frequency
        satellite.establishConnection("ETHEREUM", 40, "SIMPLE");
    }
}
