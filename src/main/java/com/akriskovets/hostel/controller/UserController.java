package com.akriskovets.hostel.controller;

import com.akriskovets.hostel.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test success!";
    }

    @GetMapping("/all")
    public ResponseEntity<List> getAllUsernames() {
        return new ResponseEntity<>(userService.getAllUsernames(), HttpStatus.OK);
    }
}
