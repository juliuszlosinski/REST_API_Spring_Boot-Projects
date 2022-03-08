package com.example.monsters.models;

import java.util.ArrayList;

public class Monster
{
    // REGION: STATIC FIELDS. ---]
    public static ArrayList<Monster> allMonsters = new ArrayList<>();
    // END REGION ---------------]

    // REGION: FIELDS -----------]
    int id;
    String name;
    String type;
    int age;
    // END REGION ---------------]

    // REGION: PROPERTIES ---------------------------------------]
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // END REGION ------------------------------------------------]
}

