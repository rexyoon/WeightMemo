package com.store.service;

import com.store.dto.UserDTO;
import com.store.entity.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
}
