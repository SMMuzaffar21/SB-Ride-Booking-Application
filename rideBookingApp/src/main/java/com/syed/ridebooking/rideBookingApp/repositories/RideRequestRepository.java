package com.syed.ridebooking.rideBookingApp.repositories;

import com.syed.ridebooking.rideBookingApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
