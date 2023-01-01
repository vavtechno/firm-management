package com.firm.management.DAO;

import com.firm.management.Entity.Customer;
import com.firm.management.Entity.ProductDetail;
import com.firm.management.Entity.Products;
import com.firm.management.Entity.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Order;
import java.util.List;

@Repository
public interface IProductsDAO {
    List<Products> getAllProducts();
    List<Users> getAllUsers();
    void saveOrUpdate(Products product);
    void update(Products product);
    void deleteById(String  id);
    List<ProductDetail> getAllProductDetail();
    List<Customer> getAllCustomer();
     List<Order> getAllOrder();
}
