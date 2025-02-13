package com.store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.store.entity.WeightLog;
import com.store.service.WeightService;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/weights")
public class WeightController {

    @Autowired
    private WeightService weightService;

    @PostMapping("/{userId}")
    public WeightLog recordWeight(@PathVariable Long userId, @RequestParam double weight) {
        return weightService.saveWeight(userId, weight);
    }

    @GetMapping("/{userId}")
    public List<WeightLog> getUserWeights(@PathVariable Long userId) {
        return weightService.getUserWeights(userId);
    }
}
