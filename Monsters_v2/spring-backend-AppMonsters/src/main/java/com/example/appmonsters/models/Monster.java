package com.example.appmonsters.models;

import javax.persistence.*;

@Entity
@Table(name="Monster")
public class Monster
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="age")
    private int age;

    public Monster()
    {

    }

    public Monster(String name, String type, int age)
    {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
