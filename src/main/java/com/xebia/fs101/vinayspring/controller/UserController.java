package com.xebia.fs101.vinayspring.controller;

import com.xebia.fs101.vinayspring.entity.User;
import com.xebia.fs101.vinayspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/save/user")
    public ResponseEntity<?> save(@Valid @RequestBody User user){


        User savedUser = userService.save(user);
        return new ResponseEntity<>(savedUser.getId(), CREATED);
    }
    @GetMapping("/get/user/{id}")
    public ResponseEntity<?> get(@PathVariable(value = "id") Long id){

        User user = userService.find(id);
        return new ResponseEntity<>(user,OK);
    }


}
