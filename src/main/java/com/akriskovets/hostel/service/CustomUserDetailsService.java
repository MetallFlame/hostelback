package com.akriskovets.hostel.service;

import com.akriskovets.hostel.model.user.User;
import com.akriskovets.hostel.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userFromDB = userRepository.findByEmail(username);
        return null;
    }


    public List<String> getAllUsernames() {
        return userRepository.findAll().stream().map(User::getEmail).collect(Collectors.toList());
    }
}
