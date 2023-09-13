package com.example.Signin_and_login.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Account extends BaseEntity{

    private String username;
    private String password;
    private String email;
    private String status = "INACTIVE";

    @ManyToOne
    @JoinColumn(name="role_id")
    @JsonManagedReference
    private Role role;

//contructer lấy account và add role cho acc đó
    public Account(String username, String password, String email, String status, Long role_id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.role = new Role(role_id);
    }
}
