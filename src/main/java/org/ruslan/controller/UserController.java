package org.ruslan.controller;

import org.ruslan.dto.UserDto;
import org.ruslan.entity.UserEntity;
import org.ruslan.repository.UserEntityRepository;
import org.ruslan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// GET /api/users - return all users
// GET /api//user/{id} - return users
// POST /api/user - create user


@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("users")
    public List<UserDto> getUser() {
        return service.getUsers();
    }


    @PostMapping("user")
    public int saveUser(@RequestBody UserDto userDto) {
        return service.saveUser(userDto);
    }
}
