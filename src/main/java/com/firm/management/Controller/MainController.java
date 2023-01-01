package com.firm.management.Controller;

import com.firm.management.Entity.*;
import com.firm.management.Request.SaveOrUpdateRequest;
import com.firm.management.Service.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Order;
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
    @GetMapping("/productDetail")
    public List<ProductDetail> ProductDetail() {
        return productsService.getAllProductDetail();
    }
    @GetMapping("/order")
    public List<Order> Order() {
        return productsService.getAllOrder();
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody SaveOrUpdateRequest request) {
        productsService.saveOrUpdate(request);
    }

    @GetMapping("/deleteById/{id}")
    public void saveOrUpdate(@PathVariable String id) {
        productsService.delete(id);
    }

}
