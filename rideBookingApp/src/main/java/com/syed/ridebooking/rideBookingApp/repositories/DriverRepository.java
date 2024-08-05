package com.syed.ridebooking.rideBookingApp.repositories;

import com.syed.ridebooking.rideBookingApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
