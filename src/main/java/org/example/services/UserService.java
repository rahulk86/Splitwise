package org.example.services;

import org.example.dtos.UserDto;

public interface UserService {
    UserDto getUser(Long userId);
    UserDto createUser(UserDto user);
}
