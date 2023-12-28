package com.everton.wwiiplanes.wwiiplanes.usecase;

import com.everton.wwiiplanes.wwiiplanes.model.Planes;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesRepository;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesUsecase;
import com.everton.wwiiplanes.wwiiplanes.repository.PlanesRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanesUsecaseImpl implements PlanesUsecase {

    PlanesRepository planesRepository;

    public PlanesUsecaseImpl(PlanesRepository planesRepository){
        this.planesRepository = planesRepository;
    }

    @Override
    public List<Planes> getPlanes() {
        return planesRepository.getPlanesDTO();
    }
}
