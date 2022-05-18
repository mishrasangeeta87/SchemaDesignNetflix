package com.example.schemadesignnetflix.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;

@Getter
@Setter
@Entity
public class UserVideos extends BaseModel {
    // UserVideo: User
    //1 user video belongs to: 1
    // M : 1 1 user can have many uservideos
    //=>M:1

    @ManyToOne
    private User user;


    // UserVideo: Video
    //1 user video belongs to: 1 Video
    // M : 1 1 Video can be part of many uservideos
    //=>M:1

    @ManyToOne
    private Video video;

    private Status Status;
    @LastModifiedDate
    private Date lastWatchedDate;
}
