package com.syed.project.ridebooking.app.repositories;

import com.syed.project.ridebooking.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
