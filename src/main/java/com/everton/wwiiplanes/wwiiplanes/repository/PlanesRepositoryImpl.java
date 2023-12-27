package com.everton.wwiiplanes.wwiiplanes.repository;

import com.everton.wwiiplanes.wwiiplanes.Planes;
import com.everton.wwiiplanes.wwiiplanes.interfaces.PlanesRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PlanesRepositoryImpl implements PlanesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Planes> getPlanesDTO() {

        TypedQuery<Planes> query = entityManager.createQuery("from Planes", Planes.class);

        return query.getResultList();
    }
}
