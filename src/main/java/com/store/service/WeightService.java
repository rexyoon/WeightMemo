package com.store.service;

import java.util.List;

import com.store.dto.UserDTO;
import com.store.entity.WeightLog;

public interface WeightService {
    WeightLog saveWeight(Long userId, double weightValue);
    List<WeightLog> getUserWeights(Long userId);
}
