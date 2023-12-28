package com.everton.wwiiplanes.wwiiplanes.domain.repository;

import com.everton.wwiiplanes.wwiiplanes.domain.model.Plane;

import java.util.List;

public interface PlanesRepository  {

    List<Plane> getPlanesDTO();

    Plane addPlane(Plane plane);

    Plane searchPlane(Long id);

    void remove(Plane plane);

}
