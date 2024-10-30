package com.syed.project.ridebooking.app.repositories;

import com.syed.project.ridebooking.app.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
