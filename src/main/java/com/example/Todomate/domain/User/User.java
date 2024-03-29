package com.example.Todomate.domain.User;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    protected User() {
    }

    public User(String name, Integer age) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("잘못된 name(%s)이 들어왔습니다.");
        }        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void updateName(String name){
        this.name = name;
    }
}
