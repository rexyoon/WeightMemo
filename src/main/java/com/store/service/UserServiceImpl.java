package com.store.service;

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
	public UserDTO createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
    
//    @Override
//    public UserDTO createUser(UserDTO userDTO) {
//        User user = User.builder()
//                .username(userDTO.getUsername())
//                .email(userDTO.getEmail())
//                .password("hashed_password") // 실제로는 BCrypt 등으로 암호화 필요
//                .build();
//        User savedUser = userRepository.save(user);
//        return new UserDTO(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail(), savedUser.getCreatedAt());
//    }
//
//    @Override
//    public UserDTO getUserById(Long id) {
//        Optional<User> user = userRepository.findById(id);
//        return user.map(u -> new UserDTO(u.getId(), u.getUsername(), u.getEmail(), u.getCreatedAt())).orElse(null);
//    }
}