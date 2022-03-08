package com.example.appmonsters.controllers;

import com.example.appmonsters.models.Monster;
import com.example.appmonsters.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("api/")
public class MonsterController
{
    @Autowired
    MonsterService service;

    @GetMapping("monsters")
    public List<Monster> getMonsters()
    {
        return service.findAll();
    }
}
