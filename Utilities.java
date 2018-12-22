package com.hikmawan.gayuh.Utilities;

import static java.lang.Math.toRadians;

public class Utilities {
    public static double CalculateDistanceInMeters(double initialLat,
                                                   double initialLong,
                                                   double finalLat,
                                                   double finalLong) {

        int R = 6378137;    // Earth radius (meters)
        
        double dLat = toRadians(finalLat) - toRadians(initialLat);
        double dLon = toRadians(finalLong) - toRadians(initialLong);

        initialLat = toRadians(initialLat);
        finalLat = toRadians(finalLat);

        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(initialLat) * Math.cos(finalLat);
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return R * c;
    }
}
