package com.syed.ridebooking.rideBookingApp.repositories;

import com.syed.ridebooking.rideBookingApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRespository extends JpaRepository<Rider, Long> {
}
