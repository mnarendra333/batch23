package com.pragim.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragim.flightreservation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
