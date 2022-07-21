package com.users.apiusers.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.apiusers.model.UsersModel;

@RestController
@RequestMapping("/api")
public class UsersController {
    
    @PostMapping("/addUsers")
    public ResponseEntity<String> addUsers(@Valid @RequestBody UsersModel param) {
        return ResponseEntity.ok("Valid");
    }
}
