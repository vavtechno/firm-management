package com.firm.management.Controller;

import com.firm.management.Entity.*;
import com.firm.management.Request.*;
import com.firm.management.Service.IProductsService;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    IProductsService productsService;

    @GetMapping("/products")
    public List<Products> products() {
        return productsService.getAllProducts();
    }

    @GetMapping("/users")
    public List<Users> users() {
        return productsService.getAllUsers();
    }

    @GetMapping("/customer")
    public List<Customer> customer() {
        return productsService.getAllCustomer();
    }

    @GetMapping("/orders")
    public List<Orders> orders() {
        return productsService.getAllOrders();
    }


    @GetMapping("/academic_program")
    public List<AcademicProgram> academic_program() {
        return productsService.getAllAcademicProgram();
    }

    @GetMapping("/teachers")
    public List<Teachers> teachers() {
        return productsService.getAllTeachers();
    }


    @PostMapping("/academicProgramByClass")
    public List<AcademicProgram> academicProgramByClass(@RequestBody AcademicProgramByIdRequest request) {
        return productsService.getAcademicProgramByClassService(request);
    }

    @PostMapping("/ordersByBrand")
    public List<Orders> ordersByBrand(@RequestBody OrdersByBrandRequest request) {
        return productsService.getOrdersByBrandService(request);
    }

    @PostMapping("/productsByColor")
    public List<Products> productsByColor(@RequestBody ProductsByColorRequest request) {
        return productsService.getProductsByColor(request);
    }

    @PostMapping("/UsersByTitle")
    public List<Users> UsersByTitle(@RequestBody UsersByTitleRequest request) {
        return productsService.getUsersByTitleService(request);
    }

    @PostMapping("/TeachersByBranch")
    public List<Teachers> TeachersByBranch(@RequestBody TeachersByBranchRequest request) {
        return productsService.getTeachersByBranchService(request);
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody AddUserRequest request) {
        return productsService.addUser(request);
    }

    @PostMapping("/addOrder")
    public boolean addOrder(@RequestBody AddOrderRequest request) {
        return productsService.addOrder(request);
    }

    @PostMapping("/addCustomer")
    public boolean addCustomer(@RequestBody AddCustomerRequest request) {
        return productsService.addCustomer(request);
    }

    @PostMapping("/addAcademicProgram")
    public boolean addAcademicProgram(@RequestBody AddAcademicProgramRequest request) {
        return productsService.addAcademicProgram(request);
    }

    @PostMapping("/addProduct")
    public boolean addProduct(@RequestBody AddProductRequest request) {
        return productsService.addProduct(request);
    }
    @PostMapping("/addTeachers")
    public boolean addTeachers(@RequestBody AddTeachersRequest request) {
        return productsService.addTeacher(request);
    }



    @PostMapping("/deleteTeachersByPhone")
    public String deleteTeachersByPhone(@RequestBody DeleteTeachersByPhoneRequest request) {
        return productsService.deleteTeachersByPhone(request);
    }
    @PostMapping("/deleteProductById")
    public String deleteProductById(@RequestBody DeleteProductByIdRequest request) {
        return productsService.deleteProductById(request);
    }

    @PostMapping("/deleteUsersByAge")
    public String deleteUsersByAge(@RequestBody DeleteUsersByAgeRequest request) {
        return productsService.deleteUsersByAge(request);
    }
    @PostMapping("/deleteOrdersByBrand")
    public String deleteOrdersByBrand(@RequestBody DeleteOrdersByBrandRequest request) {
        return productsService.deleteOrdersByBrand(request);
    }

    @PostMapping("/deleteCustomerByAddress")
    public String deleteCustomerByAddress(@RequestBody DeleteCustomerByAddress request) {
        return productsService.deleteCustomerByAddress(request);
    }
    @PostMapping("/deleteAcademicProgramByLessons")
    public String deleteAcademicProgramByLessons(@RequestBody DeleteAcademicProgramByLessons request) {
        return productsService.deleteAcademicProgramByLessons(request);
    }

    @PostMapping("/saveOrUpdateToCalendar")
    public void saveOrUpdateToCalendar(@RequestBody CalendarSaveOrUpdateRequest request) {
        productsService.saveOrUpdateToCalendar(request);
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody SaveOrUpdateRequest request) {
        productsService.saveOrUpdate(request);
    }


}
