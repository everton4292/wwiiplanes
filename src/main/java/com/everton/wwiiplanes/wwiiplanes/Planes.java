package com.everton.wwiiplanes.wwiiplanes;

import jakarta.persistence.Entity;

@Entity
public record Planes(String name, String weapon){}