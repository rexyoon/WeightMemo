package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.WeightLog;

public interface WeightLogRepository extends JpaRepository<WeightLog, Long> {
    List<WeightLog> findByUserId(Long userId);
}
