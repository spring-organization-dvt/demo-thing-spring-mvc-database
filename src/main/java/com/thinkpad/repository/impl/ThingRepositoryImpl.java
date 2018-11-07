package com.thinkpad.repository.impl;

import com.thinkpad.model.Thing;
import com.thinkpad.repository.ThingRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional
public class ThingRepositoryImpl implements ThingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Thing findById(int id) {
        TypedQuery<Thing> query = entityManager.createQuery("select t from Thing t where t.id=:id", Thing.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
