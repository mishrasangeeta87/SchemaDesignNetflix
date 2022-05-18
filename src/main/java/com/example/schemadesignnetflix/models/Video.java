package com.example.schemadesignnetflix.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Video extends BaseModel{
    private String name;
    private String description;

    //Video : Cast
    //1 : Many
    //Many: 1
    //=>M:M

    @ManyToMany(mappedBy = "videoList")
    private List<Cast> castList;
}
