package com.rukon.springboot.service;

import com.rukon.springboot.dto.UserLocationDTO;
import com.rukon.springboot.model.User;
import com.rukon.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Set<UserLocationDTO> getAllUsersLocation() {
        return userRepository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toSet());

    }

    private UserLocationDTO convertEntityToDto(User user) {

        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());

        return userLocationDTO;

    }
}
