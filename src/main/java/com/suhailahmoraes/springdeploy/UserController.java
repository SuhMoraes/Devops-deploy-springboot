package com.suhailahmoraes.springdeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping
    public User save(@RequestBody User user){
        repository.save(user);
        return user;
    }

    @GetMapping
    public List<User> list(){
        return repository.findAll();
    }
}
