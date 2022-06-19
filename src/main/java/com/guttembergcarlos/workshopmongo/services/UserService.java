package com.guttembergcarlos.workshopmongo.services;

import com.guttembergcarlos.workshopmongo.domain.User;
import com.guttembergcarlos.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return this.repository.findAll();
    }
}
