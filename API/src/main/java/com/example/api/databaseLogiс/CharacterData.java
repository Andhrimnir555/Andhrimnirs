/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.databaseLogiс;

import com.example.api.entity.CharacterEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 *
 * @author Boris
 */
public class CharacterData {

    public static CharacterEntity findById(int id) {
        CharacterEntity res = HibernateSession.getSessionFactory().openSession().get(CharacterEntity.class, id);
        res.setEpisode(res.getEpisode().replaceAll("ep", "https://rickandmortyapi.com/api/episode/"));
        return res;
    }

    public void save(CharacterEntity character) {
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.saveOrUpdate(character);
            tx1.commit();
        }
    }

    public static List<CharacterEntity> findAll() {
        List<CharacterEntity> characters = (List<CharacterEntity>) HibernateSession.getSessionFactory().openSession().createQuery("from CharacterEntity").list();
        return characters;
    }
}
