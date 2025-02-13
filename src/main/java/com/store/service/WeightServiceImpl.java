package com.store.service;

import java.util.List;

import org.apache.lucene.search.Weight;
import org.springframework.beans.factory.annotation.Autowired;

import com.store.dto.UserDTO;
import com.store.entity.User;
import com.store.entity.WeightLog;
import com.store.mapper.WeightMapper;
import com.store.repository.UserRepository;

public class WeightServiceImpl implements WeightService{
	 @Autowired
	    private WeightMapper weightMapper;

	    @Autowired
	    private UserRepository userRepository;

	    @Override
	    public WeightLog saveWeight(Long userId, double weightValue) {
	        User user = userRepository.findById(userId)
	                .orElseThrow(() -> new IllegalArgumentException("User not found"));
	        WeightLog weight = new WeightLog(user, weightValue);
	        weightMapper.insertWeight(weight);
	        return weight;
	    }

	    @Override
	    public List<WeightLog> getUserWeights(Long userId) {
	        return weightMapper.findWeightsByUserId(userId);
	    }
}
