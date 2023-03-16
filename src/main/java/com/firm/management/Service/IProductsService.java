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
    List<Teachers> getAllTeachers();

    void saveOrUpdateToCalendar(CalendarSaveOrUpdateRequest request);

    void saveOrUpdate(SaveOrUpdateRequest request);

    void update(Products product);


    List<AcademicProgram> getAcademicProgramByClassService(AcademicProgramByIdRequest request);
    List<Orders> getOrdersByBrandService(OrdersByBrandRequest request);
    List<Products> getProductsByColor(ProductsByColorRequest request);
    List<Users> getUsersByTitleService(UsersByTitleRequest request);
    List<Teachers> getTeachersByBranchService(TeachersByBranchRequest request);

    boolean addUser(AddUserRequest request);
    boolean addOrder(AddOrderRequest request);
    boolean addCustomer(AddCustomerRequest request);
    boolean addAcademicProgram(AddAcademicProgramRequest request);
    boolean addProduct(AddProductRequest request);
    boolean addTeacher(AddTeachersRequest request);

    String deleteTeachersByPhone(DeleteTeachersByPhoneRequest request);
    String deleteProductById(DeleteProductByIdRequest request);
    String deleteUsersByAge(DeleteUsersByAgeRequest request);
    String deleteOrdersByBrand(DeleteOrdersByBrandRequest request);
    String deleteCustomerByAddress(DeleteCustomerByAddress request);
    String deleteAcademicProgramByLessons(DeleteAcademicProgramByLessons request);
}
