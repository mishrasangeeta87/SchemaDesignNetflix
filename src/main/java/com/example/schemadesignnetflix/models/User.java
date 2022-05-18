package com.example.schemadesignnetflix.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;

    //1 User can have M profiles;
    // User: Profile
    //1:M
    //M:1
    //=>M:M
    @ManyToMany(mappedBy = "userList")
    private List<Profile> profileList;

}
