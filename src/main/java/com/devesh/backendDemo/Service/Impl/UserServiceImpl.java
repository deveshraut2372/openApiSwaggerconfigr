package com.devesh.backendDemo.Service.Impl;

import com.devesh.backendDemo.Model.User;
import com.devesh.backendDemo.Model.UserReq;
import com.devesh.backendDemo.Repository.UserRepository;
import com.devesh.backendDemo.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(UserReq userReq)
    {
        System.out.println("  UserReq ="+userReq.toString());
        User user=new User();
        BeanUtils.copyProperties(userReq,user);
        return userRepository.save(user);
    }

    public List getAll()
    {
        return userRepository.findAll();
    }

    public User getById(Integer id)
    {
        return userRepository.findById(id).get();
    }

}
