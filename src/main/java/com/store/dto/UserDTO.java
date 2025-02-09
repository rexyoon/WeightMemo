package com.store.dto;

import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

import com.store.entity.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private Date createdAt;
    
    public  UserDTO(User user) {
    	this.id = user.getId();
    	this.username = user.getUsername();
    	this.email = user.getEmail();
    }   
}

