package com.everton.wwiiplanes.wwiiplanes.domain.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_weapons")
public class Weapons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    @Column
    private String guns;

    @Nullable
    @Column
    private String bombs;

    @Nullable
    @Column
    private String rockets;

    public String getGuns() {
        return guns;
    }

    public void setGuns(String guns) {
        this.guns = guns;
    }

    public String getBombs() {
        return bombs;
    }

    public void setBombs(String bombs) {
        this.bombs = bombs;
    }

    public String getRockets() {
        return rockets;
    }

    public void setRockets(String rockets) {
        this.rockets = rockets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
