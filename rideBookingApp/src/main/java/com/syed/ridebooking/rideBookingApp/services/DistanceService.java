package com.syed.ridebooking.rideBookingApp.services;
//Using OSRM - > Open Source Routing Machine,
// used to calculate distance between two points by road
//Also can use google maps, but its paid

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dest);
}
