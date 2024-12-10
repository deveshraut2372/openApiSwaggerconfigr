package com.devesh.backendDemo.Controller;

import com.devesh.backendDemo.Model.User;
import com.devesh.backendDemo.Model.UserReq;
import com.devesh.backendDemo.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody UserReq userReq )
    {

        User user1=userService.createUser(userReq);
        return user1;
    }

    @GetMapping("/getAll")
    public List createUser()
    {
        List list=userService.getAll();
        return list;
    }

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable Integer id)
    {
        User user=userService.getById(id);
        return user;
    }



}
