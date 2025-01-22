package com.unik.spring_sec_demo.service;

import com.unik.spring_sec_demo.dao.UserRepo;
import com.unik.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }

}
