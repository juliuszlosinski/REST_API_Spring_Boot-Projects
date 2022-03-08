package com.example.appmonsters;

import com.example.appmonsters.models.Monster;
import com.example.appmonsters.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMonstersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppMonstersApplication.class, args);
    }

    @Autowired
    MonsterService service;

    @Override
    public void run(String... args) throws Exception {
        service.save(new Monster("Jack", "sand", 15));
        service.save(new Monster("Perk", "water", 10));
        service.save(new Monster("Loop", "water", 16));
    }
}
