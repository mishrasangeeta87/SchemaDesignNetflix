package com.example.schemadesignnetflix.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Cast extends BaseModel{
    private String name;

    //Cast : Video
    //1 : Many
    //Many: 1
    //=>M:M

    @ManyToMany
    private List<Video> videoList;
    //2022-05-18 08:45:59.038 ERROR 1847 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Illegal use of mappedBy on both sides of the relationship: com.example.schemadesignnetflix.models.User.videoList
}
