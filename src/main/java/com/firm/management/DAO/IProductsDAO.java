package com.firm.management.DAO;

import com.firm.management.Entity.Products;
import com.firm.management.Entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductsDAO {
    List<Products> getAllProducts();
    List<Users> getAllUsers();
    void saveOrUpdate(Products product);
    void update(Products product);
    void deleteById(String  id);
}
