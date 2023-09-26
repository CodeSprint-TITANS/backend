package com.sit.TitanBackend.Controller;

import com.sit.TitanBackend.Entity.User;
import com.sit.TitanBackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value= "/save")
    public String saveUser(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user.getUserId();
    }

    @GetMapping(value= "/getAll")
    public Iterable<User> getUsers(){
        Iterable<User> users = userService.getAll();
        return users;
    }

    @PutMapping(value= "/update/{id}")
    public User updateUser(@RequestBody User user,
                           @PathVariable(name="id") String userId){
        user.setUserId(userId);
        userService.saveOrUpdate(user);
        return user;
    }

    @GetMapping(value= "/get/{id}")
    public User getUsers(@PathVariable(name="id") String userId){
        return userService.findByUserId(userId);
    }

}
