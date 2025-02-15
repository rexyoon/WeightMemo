package com.store.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.store.dto.UserDTO;
import com.store.entity.User;
import com.store.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        // 중복된 사용자 체크
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new RuntimeException("이미 존재하는 사용자 이름입니다: " + user.getUsername());
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("이미 존재하는 이메일입니다: " + user.getEmail());
        }

        // 생성 시간 설정 (자동 저장)
        //user.setCreatedAt(new Date());

        // 사용자 저장
        return userRepository.save(user);
    }
	  @Override
	    public User getUserById(Long userId) {
	        return userRepository.findById(userId)
	                .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다: " + userId));
	    }

}