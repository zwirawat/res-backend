package com.research.resbackend.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "research")
public class Research {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name_res")
    @Size(max = 255)
    String name;

    Date date;


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Research(Long id, @Size(max = 255) String name, Date date) {

        this.id = id;
        this.name = name;
        this.date = date;
    }

    
}
