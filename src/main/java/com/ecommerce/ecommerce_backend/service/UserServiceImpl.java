package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.UserRequestDto;
import com.ecommerce.ecommerce_backend.dto.UserResponseDto;
import com.ecommerce.ecommerce_backend.entity.User;
import com.ecommerce.ecommerce_backend.repository.UserRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        try {
            User savedUser = userRepository.save(user);

            return new UserResponseDto(
                    savedUser.getId(),
                    savedUser.getName(),
                    savedUser.getEmail(),
                    savedUser.getCreatedAt()
            );

        } catch (DataIntegrityViolationException ex) {
            throw new RuntimeException("Email already exists");
        }
    }
}
