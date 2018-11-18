package org.shaong.javagoproxy.controllers;

import org.shaong.javagoproxy.models.UserData;
import org.shaong.javagoproxy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/{userId}",
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    private Optional<UserData> getUserData(@PathVariable Integer userId) {
        try {
            return userService.getUserData(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
