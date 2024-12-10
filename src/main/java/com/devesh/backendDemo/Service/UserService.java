package com.devesh.backendDemo.Service;

import com.devesh.backendDemo.Model.User;
import com.devesh.backendDemo.Model.UserReq;

import java.util.List;

public interface UserService {
    User createUser(UserReq user);

    List getAll();

    User getById(Integer id);
}
