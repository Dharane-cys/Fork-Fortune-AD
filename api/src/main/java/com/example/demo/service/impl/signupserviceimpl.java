package com.example.demo.service.impl;

import lombok.AllArgsConstructor;
import com.example.demo.dto.*;
import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class signupserviceimpl implements signupservice {

    private signuprepo userRepository;

    @Override
    public signupdto createUser(signupdto userDto) {

        signupentity user = signupmapper.mapToUser(userDto);
        signupentity savedUser = userRepository.save(user);
        return signupmapper.mapToUserDto(savedUser);
    }

   
}
