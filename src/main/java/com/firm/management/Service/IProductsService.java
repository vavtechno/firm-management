package com.firm.management.Service;

import com.firm.management.Entity.Products;
import com.firm.management.Request.SaveOrUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductsService {
    List<Products> getAll();

    void saveOrUpdate(SaveOrUpdateRequest request);

    void update(Products product);

    void delete(String id);
}
