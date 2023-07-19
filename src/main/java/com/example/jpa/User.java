package com.example.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "display_name" ,nullable = true,length = 50)
    private String displayName;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL UNIQUE ")
    private String bio;

    @ManyToMany
    private List<Role> role;
}
