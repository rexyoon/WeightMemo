package com.store.repository;

import java.util.List;

import com.store.entity.WeightLog;

public interface WeightLogRepository {
	 List<WeightLog> findByUserId(Long userId);
}
