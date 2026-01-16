package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.UserRequestDto;
import com.ecommerce.ecommerce_backend.dto.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto request);
}
