package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.UserImplementationService;
import com.example.employeemanagementsystem.model.User;
import com.example.employeemanagementsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);

        if (user == null)
            throw new UsernameNotFoundException("User 404");

        return new UserImplementationService(user);
    }
}