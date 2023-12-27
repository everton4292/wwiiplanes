package com.everton.wwiiplanes.wwiiplanes.controller;


import com.everton.wwiiplanes.wwiiplanes.Planes;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesUsecase;
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
    public List<Planes> getPlanes(){

        List<Planes> planes = planesUsecase.getPlanes();
        System.out.println(planes);

        return planes;
    }
}
