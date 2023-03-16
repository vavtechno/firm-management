package com.firm.management.DAO;

import com.firm.management.Entity.*;
import com.firm.management.Request.AddAcademicProgramRequest;
import com.firm.management.Request.AddUserRequest;
import com.firm.management.Request.OrdersByBrandRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductsDAO {
    List<Products> getAllProducts();
    List<Users> getAllUsers();
    List<Customer> getAllCustomer();
    List<Orders> getAllOrders();
    List<AcademicProgram> getAllAcademicProgram();
    List<Teachers> getAllTeachers();
    void saveOrUpdate(Products product);
    void update(Products product);
    void saveOrUpdateToCalendar(AcademicProgram program);

    List<AcademicProgram> getAcademicProgramByClassDAO(String classCode);
    List<Orders> getOrdersByBrand(String brandName);

    List<Products> getProductsDAO(String color);
    List<Users> getUsersByTitle(String title);
    List<Teachers> getTeachersByBranch(String branch);

    boolean addUser(Users user);
    boolean addOrder(Orders order);
    boolean addCustomer(Customer customer);
    boolean addAcademicProgram(AcademicProgram academicProgram);
    boolean addProduct(Products product);
    boolean addTeacher(Teachers teacher);

    String deleteProductById(String id);
    String  deleteUsersByAge(int age);
    String deleteOrdersByBrand(String brand);
    String deleteCustomerByAddress(String address);
    String deleteAcademicProgramByLessons(String lessons);
    String  deleteTeachersByPhone(int phone);
}
