package com.everton.wwiiplanes.wwiiplanes.usecase;

import com.everton.wwiiplanes.wwiiplanes.Planes;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesRepository;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesUsecase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanesUsecaseImpl implements PlanesUsecase {

    PlanesRepository planesRepository;

    @Override
    public List<Planes> getPlanes() {
        return planesRepository.getPlanesDTO();
    }
}
