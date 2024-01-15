package com.suhailahmoraes.springdeploy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.apache.commons.lang3.builder.HashCodeExclude;

@Entity
@Getter
@Setter
@Table(name = "table_user")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    private String login;

    private String email;


}
