package com.firm.management.DAO;

import com.firm.management.Entity.*;
import com.firm.management.Request.TeachersByBranchRequest;
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
    @Transactional
    public List<Teachers> getAllTeachers() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Teachers").getResultList();
    }

    @Override
    public List<Teachers> getTeachersByBranch(String branchName) {
        Session session = entityManager.unwrap(Session.class);
        branchName="%"+branchName+"%";
        Query q = session.createNativeQuery("select * from teachers where branch like ?1");
        q.setParameter(1, branchName);
        return  q.list();

    }

    @Override
    public boolean addTeacher(Teachers teacher) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(teacher);
        return  false;

    }

    @Override
    public List<AcademicProgram> getAcademicProgramByClassDAO(String classCode) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("select * from academic_program where classes=?1");
        q.setParameter(1, classCode);
        return  q.list();

    }

    @Override
    public boolean addAcademicProgram(AcademicProgram academicProgram) {
            Session session = entityManager.unwrap(Session.class);
            session.saveOrUpdate(academicProgram);
            return  true;
    }

    @Override
    public List<Orders> getOrdersByBrand(String brandName) {
        Session session = entityManager.unwrap(Session.class);
        brandName="%"+brandName+"%";
        Query q = session.createNativeQuery("select * from orders where brand like ?1");
        q.setParameter(1, brandName);
        return  q.list();

    }
    @Override
    public boolean addOrder(Orders order) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(order);
        return  true;

    }

    @Override
    public List<Users> getUsersByTitle(String title) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("select * from users where title=?1");
        q.setParameter(1, title);
        return  q.list();

    }

    @Override
    public boolean addUser(Users user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
        return  true;

    }

    @Override
    public List<Products> getProductsDAO(String color) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("select * from products where color=?1");
        q.setParameter(1, color);
        return  q.list();
    }



    @Override
    public boolean addProduct(Products product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
        return  false;
    }
    @Override
    public boolean addCustomer(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
        return  true;
    }

    @Override
    public String  deleteProductById(String id) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM products WHERE id=?1");
        q.setParameter(1, id);
        q.executeUpdate();
        return id + "li kayıt silindi.";
    }

    @Override
    public String  deleteUsersByAge(int age) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM users WHERE age=?1");
        q.setParameter(1, age);
        q.executeUpdate();
        return age + "yasindakiler silindi";
    }
    @Override
    public String  deleteOrdersByBrand(String brand) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM orders WHERE brand=?1");
        q.setParameter(1, brand);
        q.executeUpdate();
        return brand + " Marka ürünler silindi";
    }
    @Override
    public String  deleteCustomerByAddress(String address) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM customer WHERE address=?1");
        q.setParameter(1, address);
        q.executeUpdate();
        return address + " Sehrindekiler silindi";
    }
    @Override
    public String  deleteAcademicProgramByLessons(String lessons) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM academic_program WHERE lessons=?1");
        q.setParameter(1, lessons);
        q.executeUpdate();
        return lessons + " isimli dersler silindi";
    }

    @Override
    public String  deleteTeachersByPhone(int phone) {
        Session session = entityManager.unwrap(Session.class);
        Query q = session.createNativeQuery("DELETE FROM teachers WHERE phone=?1");
        q.setParameter(1, phone);
        q.executeUpdate();
        return phone + "  bu telefon numaralari silindi";
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

}
