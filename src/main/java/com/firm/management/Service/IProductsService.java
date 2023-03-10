package com.firm.management.Service;

import com.firm.management.Entity.*;
import com.firm.management.Request.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
    List<Orders> getOrdersByBrandService(OrdersByBrandRequest request);
    List<Products> getProductsByColor(ProductsByColorRequest request);
    List<Users> getUsersByTitleService(UsersByTitleRequest request);

    boolean addUser(AddUserRequest request);
    boolean addOrder(AddOrderRequest request);
    boolean addCustomer(AddCustomerRequest request);
    boolean addAcademicProgram(AddAcademicProgramRequest request);
    boolean addProduct(AddProductRequest request);
}
