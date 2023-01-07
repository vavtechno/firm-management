package com.firm.management.DAO;

import com.firm.management.Entity.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductsDAO implements IProductsDAO{

    private EntityManager entityManager;

    @Autowired
    public ProductsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Products> getAllProducts() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Products ").getResultList();
    }
    @Override
    @Transactional
    public List<Users> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Users ").getResultList();
    }
    @Override
    @Transactional
    public List<Customer> getAllCustomer() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Customer ").getResultList();
    }

    @Override
    @Transactional
    public List<Orders> getAllOrders() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Orders ").getResultList();
    }

    @Override
    @Transactional
    public List<AcademicProgram> getAllAcademicProgram() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from AcademicProgram ").getResultList();
    }

    @Override
    public List<AcademicProgram> getAcademicProgramByClassDAO(String classCode) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("select * from academic_program where classes=?1");
        q.setParameter(1, classCode);
        return  q.list();

    }

    @Override
    public void saveOrUpdate(Products product) {
        try{
            Session session = entityManager.unwrap(Session.class);
            session.saveOrUpdate(product);
        }catch (Exception e){

        }

    }

    @Override
    public void saveOrUpdateToCalendar(AcademicProgram program) {
        try {
            Session session = entityManager.unwrap(Session.class);
            session.saveOrUpdate(program);
        } catch (Exception e) {

        }

    }

    @Override
    public void update(Products product) {

    }

    @Override
    public void deleteById(String id) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("delete from Products where id =?1");
        q.setParameter(1,id);
        q.executeUpdate();
    }
}
