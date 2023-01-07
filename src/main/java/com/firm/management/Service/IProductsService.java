package com.firm.management.Service;

import com.firm.management.Entity.*;
import com.firm.management.Request.AcademicProgramByIdRequest;
import com.firm.management.Request.CalendarSaveOrUpdateRequest;
import com.firm.management.Request.SaveOrUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductsService {
    List<Users> getAllUsers();
    List<Products> getAllProducts();
    List<Customer> getAllCustomer();
    List<Orders> getAllOrders();
    List<AcademicProgram> getAllAcademicProgram();

    void saveOrUpdateToCalendar(CalendarSaveOrUpdateRequest request);

    void saveOrUpdate(SaveOrUpdateRequest request);

    void update(Products product);

    void delete(String id);

    List<AcademicProgram> getAcademicProgramByClassService(AcademicProgramByIdRequest request);
}
