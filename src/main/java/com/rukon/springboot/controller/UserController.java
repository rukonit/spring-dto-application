package com.rukon.springboot.controller;

import com.rukon.springboot.dto.UserLocationDTO;
import com.rukon.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public Set<UserLocationDTO> getAllUsersLocation() {
        return userService.getAllUsersLocation();
    }
}
