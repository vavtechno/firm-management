package com.firm.management.Service;

import com.firm.management.Entity.*;
import com.firm.management.Request.SaveOrUpdateRequest;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import java.util.List;
@Service
public interface IProductsService {
    List<Users> getAllUsers();
    List<Products> getAllProducts();
    List<Customer> getAllCustomer();
    List<Order> getAllOrder();
    void saveOrUpdate(SaveOrUpdateRequest request);

    void update(Products product);

    void delete(String id);

    List<ProductDetail> getAllProductDetail();
}
