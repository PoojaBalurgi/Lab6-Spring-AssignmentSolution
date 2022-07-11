package com.gl.labsix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.labsix.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("from User u where u.username=?1")
	User getUserByUserName(String username);

}
