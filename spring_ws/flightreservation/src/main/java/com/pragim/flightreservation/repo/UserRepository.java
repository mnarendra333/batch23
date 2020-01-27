package com.pragim.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pragim.flightreservation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email=:email and u.password=:password")
	User findByEmailAndPassword(@Param("email") String email,
			@Param("password") String password);

}
