package com.sit.TitanBackend.Service;

import com.sit.TitanBackend.Entity.User;
import com.sit.TitanBackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public User findByUserId(String userId) {
        return userRepository.findById(userId).get();
    }
}
