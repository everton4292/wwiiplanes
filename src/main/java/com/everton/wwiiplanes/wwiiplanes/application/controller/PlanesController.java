package com.everton.wwiiplanes.wwiiplanes.application.controller;


import com.everton.wwiiplanes.wwiiplanes.domain.model.Plane;
import com.everton.wwiiplanes.wwiiplanes.application.interfaces.PlanesUsecase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlanesController {

    private final PlanesUsecase planesUsecase;

    public PlanesController(PlanesUsecase planesUsecase){
        this.planesUsecase = planesUsecase;
    }

    @GetMapping("/getPlanes")
    public List<Plane> getPlanes(){

        List<Plane> planes = planesUsecase.getPlanes();
        System.out.println(planes.toString());

        return planes;
    }
}
