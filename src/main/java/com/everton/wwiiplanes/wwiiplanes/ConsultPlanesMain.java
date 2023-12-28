package com.everton.wwiiplanes.wwiiplanes;


import com.everton.wwiiplanes.wwiiplanes.domain.repository.PlanesRepository;
import com.everton.wwiiplanes.wwiiplanes.domain.model.Plane;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

//Non-web application
public class ConsultPlanesMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(WwiiplanesApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

       PlanesRepository planesRepository = applicationContext.getBean(PlanesRepository.class);

       List<Plane> planes = planesRepository.getPlanesDTO();

       for (Plane planeInList : planes) {
           System.out.println(planeInList.getName());
       }
    }
}
