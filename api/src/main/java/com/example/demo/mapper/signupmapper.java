package com.example.demo.mapper;

import com.example.demo.entity.signupentity;
import com.example.demo.dto.signupdto;
public class signupmapper {

    public static signupdto mapToUserDto(signupentity user){
        return new signupdto(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getPassword()
        );
    }

    public static signupentity mapToUser(signupdto userDto){
        return new signupentity(
                userDto.getId(),
                userDto.getUserName(),
                userDto.getEmail(),
                userDto.getPassword()
        );
    }
}
