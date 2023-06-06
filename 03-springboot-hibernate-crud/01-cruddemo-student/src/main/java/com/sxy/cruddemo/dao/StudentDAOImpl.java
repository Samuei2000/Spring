package com.sxy.cruddemo.dao;

import com.sxy.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{
    //define field for entity manager
    private EntityManager entityManager;
    //inject entity manager using component scan
    @Autowired
    public  StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
        System.out.println(this.getClass().hashCode());
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
