package com.orient.crudspring.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Data
// @NoArgsConstructor
// @AllArgsConstructor

// @Entity(name = "accounts")
// @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountLombok {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

}
