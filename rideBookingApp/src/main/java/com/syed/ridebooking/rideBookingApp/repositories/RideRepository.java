package com.syed.ridebooking.rideBookingApp.repositories;

import com.syed.ridebooking.rideBookingApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
