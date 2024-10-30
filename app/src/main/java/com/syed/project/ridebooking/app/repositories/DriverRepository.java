package com.syed.project.ridebooking.app.repositories;

import com.syed.project.ridebooking.app.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
