package com.examportalv1.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "users")
    public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

}
