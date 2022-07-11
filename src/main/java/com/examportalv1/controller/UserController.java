package com.examportalv1.controller;

import com.examportalv1.models.Users;
import com.examportalv1.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    //creating
    @PostMapping("/")
    public Users createUser(@RequestBody Users user){
        Users userObject= this.userRepository.save(user);
        System.out.println(userObject.getId());
        return userObject;

    }
    @GetMapping("/{userId}")
    public String getUserObject(@PathVariable ("userId") Long userId){
        return "this.userRepository.findById(userId)";
    }
}
