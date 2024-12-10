package com.devesh.backendDemo.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserReq {

     Integer id;

     String name;

     String userName;

     String email;

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
