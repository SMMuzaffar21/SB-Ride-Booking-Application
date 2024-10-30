package com.syed.project.ridebooking.app.repositories;

import com.syed.project.ridebooking.app.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}
