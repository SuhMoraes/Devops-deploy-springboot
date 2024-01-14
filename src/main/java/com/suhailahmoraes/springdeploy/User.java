package com.suhailahmoraes.springdeploy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "table_user")
public class User {

    @Id
    private String login;

    private String email;

}
