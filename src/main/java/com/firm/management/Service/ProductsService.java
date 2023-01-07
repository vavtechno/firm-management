package com.firm.management.Service;

import com.firm.management.DAO.IProductsDAO;
import com.firm.management.Entity.*;
import com.firm.management.Request.AcademicProgramByIdRequest;
import com.firm.management.Request.CalendarSaveOrUpdateRequest;
import com.firm.management.Request.SaveOrUpdateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsService implements IProductsService{
    private final IProductsDAO productsDAO;

    public ProductsService(IProductsDAO productsDAO) {
        this.productsDAO = productsDAO;
    }

    @Override
    @Transactional
    public List<Products> getAllProducts() {
        return this.productsDAO.getAllProducts();
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return this.productsDAO.getAllUsers();
    }

    @Override
    @Transactional
    public List<Customer> getAllCustomer() {
        return this.productsDAO.getAllCustomer();
    }

    @Override
    @Transactional
    public List<Orders> getAllOrders() {
        return this.productsDAO.getAllOrders();
    }

    @Override
    @Transactional
    public List<AcademicProgram> getAllAcademicProgram() {
        return this.productsDAO.getAllAcademicProgram();
    }

    @Override
    @Transactional
    public List<AcademicProgram> getAcademicProgramByClassService(AcademicProgramByIdRequest request) {
        return this.productsDAO.getAcademicProgramByClassDAO(request.getClassCode());
    }

    @Override
    @Transactional
    public void saveOrUpdateToCalendar(CalendarSaveOrUpdateRequest request) {
        AcademicProgram academicProgram = new AcademicProgram();
        academicProgram.setClasses(request.getClasses());
        academicProgram.setDays(request.getDays());
        academicProgram.setLessons(request.getLessons());
        academicProgram.setHours(request.getHours());
        this.productsDAO.saveOrUpdateToCalendar(academicProgram);
    }

    @Override
    @Transactional
    public void saveOrUpdate(SaveOrUpdateRequest request) {
        Products product = new Products();
        product.setColor(request.getColor());
        product.setName(request.getName());
        product.setQuantity(request.getQuantity());
        product.setType(request.getType());
        this.productsDAO.saveOrUpdate(product);
    }

    @Override
    @Transactional
    public void update(Products product) {
        this.productsDAO.update(product);
    }

    @Override
    @Transactional
    public void delete(String  id) {
        this.productsDAO.deleteById(id);
    }
}
