package com.everton.wwiiplanes.wwiiplanes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_planes")
public class Planes {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column private String name;
    @Column private String weapons;

    protected Planes() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }
}