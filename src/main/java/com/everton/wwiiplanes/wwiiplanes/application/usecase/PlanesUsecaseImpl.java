package com.everton.wwiiplanes.wwiiplanes.application.usecase;

import com.everton.wwiiplanes.wwiiplanes.domain.model.Plane;
import com.everton.wwiiplanes.wwiiplanes.domain.repository.PlanesRepository;
import com.everton.wwiiplanes.wwiiplanes.application.interfaces.PlanesUsecase;
import org.springframework.stereotype.Service;

import java.util.List;

//Planes UseCase implementation
@Service
public class PlanesUsecaseImpl implements PlanesUsecase {

    PlanesRepository planesRepository;

    public PlanesUsecaseImpl(PlanesRepository planesRepository){
        this.planesRepository = planesRepository;
    }

    @Override
    public List<Plane> getPlanes() {
        return planesRepository.getPlanesDTO();
    }
}
