package com.everton.wwiiplanes.wwiiplanes.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_planes")
public class Plane {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column private String name;
    @Column private String weapons;
    @Column private Country country;
    @Column private String role;
    @Column private String year;

    public Plane() {}

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}