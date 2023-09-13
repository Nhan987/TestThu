package com.example.Signin_and_login.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Role extends BaseEntity {
    private String roleName;
    private String status;


    public Role(String roleName){
        this.roleName=roleName;
    }
    public Role(Long id){
        this.setId(id);
    }
}
