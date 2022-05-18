package com.example.schemadesignnetflix.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Profile extends BaseModel{
    String name;
    String pin;
    String type;

    //Profile:User
    //1:M
    //M:1
    //=>M:1

    @ManyToMany
    private List<User> userList;
   // 2022-05-18 08:45:59.038 ERROR 1847 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Illegal use of mappedBy on both sides of the relationship: com.example.schemadesignnetflix.models.User.profileList

}
