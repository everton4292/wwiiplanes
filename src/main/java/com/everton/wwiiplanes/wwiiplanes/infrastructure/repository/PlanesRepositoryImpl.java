package com.everton.wwiiplanes.wwiiplanes.infrastructure.repository;

import com.everton.wwiiplanes.wwiiplanes.domain.repository.PlanesRepository;
import com.everton.wwiiplanes.wwiiplanes.domain.model.Plane;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PlanesRepositoryImpl implements PlanesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Plane> getPlanesDTO() {

        TypedQuery<Plane> query = entityManager.createQuery("from Plane", Plane.class);

        return query.getResultList();
    }

    @Transactional
    @Override
    public Plane addPlane(Plane plane) {
       return  entityManager.merge(plane);
    }

    @Override
    public Plane searchPlane(Long id) {
        return entityManager.find(Plane.class, id);
    }

    @Transactional
    @Override
    public void remove(Plane plane) {
        plane = searchPlane(plane.getId());
        entityManager.remove(plane);
    }
}
