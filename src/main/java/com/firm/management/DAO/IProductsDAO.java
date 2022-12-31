package com.firm.management.DAO;

import com.firm.management.Entity.Products;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductsDAO {
    List<Products> getAll();
    void saveOrUpdate(Products product);
    void update(Products product);
    void deleteById(String  id);
}
