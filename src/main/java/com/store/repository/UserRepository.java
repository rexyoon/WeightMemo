package com.store.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 boolean existsByUsername(String username); // 중복 체크
	 boolean existsByEmail(String email);
}
