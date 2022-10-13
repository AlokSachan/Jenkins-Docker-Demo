package com.alok.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUserName(){
        return new ResponseEntity<>("Jenkins deployment of rest API to create docker image on remote machine and deploy", HttpStatus.OK);
    }
}
