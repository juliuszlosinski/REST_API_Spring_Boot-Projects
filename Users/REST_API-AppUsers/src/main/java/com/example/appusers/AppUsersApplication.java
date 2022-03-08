package com.example.appusers;

import com.example.appusers.model.User;
import com.example.appusers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppUsersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppUsersApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Jack", "Black", "jack@wp.pl"));
        this.userRepository.save(new User("Mark", "Kis", "mark@wp.pl"));
        this.userRepository.save(new User("Johny", "Cage", "johny@wp.pl"));
    }
}
