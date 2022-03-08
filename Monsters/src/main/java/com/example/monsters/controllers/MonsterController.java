package com.example.monsters.controllers;

import com.example.monsters.models.Monster;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MonsterController
{
    // TARGET: Finding a monster with specific id.
    @GetMapping("/monster/{id}")
    public Monster getMonster(@PathVariable("id") int id)
    {
        for(Monster m: Monster.allMonsters)
        {
            if(m.getId() == id)
            {
                return m;
            }
        }
        return null;
    }

    // TARGET: Adding the monster to the list.
    @PostMapping("/monster")
    public String addMonster(@RequestBody Monster monster)
    {
        monster.setId(Monster.allMonsters.size()+1);
        Monster.allMonsters.add(monster);
        return "Done!";
    }

    // TARGET: Getting all monsters from the list.
    @GetMapping("/allMonsters")
    public ArrayList<Monster> getAllMonsters()
    {
        return Monster.allMonsters;
    }

    // TARGET: Updating the monster.
    @PutMapping("/monster/{id}")
    public String updateMonster(@PathVariable("id") int id, @RequestBody Monster monster)
    {
        for(Monster m : Monster.allMonsters)
        {
            if(m.getId()==id)
            {
                m.setName(monster.getName());
                m.setType(monster.getType());
                m.setAge(monster.getAge());
                return "Done!";
            }
        }
        return "There is no such a monster!";
    }
}
