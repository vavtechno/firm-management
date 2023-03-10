package com.firm.management.Service;

import com.firm.management.DAO.IProductsDAO;
import com.firm.management.Entity.*;
import com.firm.management.Request.*;
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
    public List<Products> getProductsByColor(ProductsByColorRequest request) {
        return this.productsDAO.getProductsDAO(request.getColor());
    }

    @Override
    @Transactional
    public List<Orders> getOrdersByBrandService(OrdersByBrandRequest request) {
        return this.productsDAO.getOrdersByBrand(request.getBrandName());
    }

    @Override
    @Transactional
    public List<Users> getUsersByTitleService(UsersByTitleRequest request) {
        return this.productsDAO.getUsersByTitle(request.getTitle());
    }

    @Override
    @Transactional
    public boolean addUser(AddUserRequest request) {
        Users user = new Users();
        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setAge(request.getAge());
        user.setTitle(request.getTitle());
        return this.productsDAO.addUser(user);
    }

    @Override
    @Transactional
    public boolean addOrder(AddOrderRequest request) {
        Orders order = new Orders();
        order.setBrand(request.getBrand());
        order.setType(request.getType());
        order.setStock(request.getStock());
        order.setCustomer(request.getCustomer());
        return this.productsDAO.addOrder(order);
    }
    @Override
    @Transactional
    public boolean addCustomer(AddCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setAge(request.getAge());
        customer.setPhone(request.getPhone());
        customer.setAddress(request.getAddress());
        return this.productsDAO.addCustomer(customer);
    }

    @Override
    @Transactional
    public boolean addAcademicProgram(AddAcademicProgramRequest request) {
       AcademicProgram academicProgram = new AcademicProgram();
       academicProgram.setLessons(request.getLessons());
       academicProgram.setClasses(request.getClasses());
       academicProgram.setHours(request.getHours());
       academicProgram.setDays(request.getDays());
       return this.productsDAO.addAcademicProgram(academicProgram);
    }

    @Override
    @Transactional
    public boolean addProduct(AddProductRequest request) {
        Products product = new Products();
        product.setName(request.getName());
        product.setType(request.getType());
        product.setQuantity(request.getQuantity());
        product.setColor(request.getColor());
        return this.productsDAO.addProduct(product);
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
