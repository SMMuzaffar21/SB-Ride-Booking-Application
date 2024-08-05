package com.syed.ridebooking.rideBookingApp.repositories;

import com.syed.ridebooking.rideBookingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
