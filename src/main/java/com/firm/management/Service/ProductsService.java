package com.firm.management.Service;

import com.firm.management.DAO.IProductsDAO;
import com.firm.management.Entity.Products;
import com.firm.management.Entity.Users;
import com.firm.management.Request.SaveOrUpdateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsService implements IProductsService{
    private final IProductsDAO productsDAO;

    public ProductsService(IProductsDAO productsDAO) {
        this.productsDAO = productsDAO;
    }

    @Override
    @Transactional
    public List<Products> getAllProducts() {
        return this.productsDAO.getAllProducts();
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return this.productsDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveOrUpdate(SaveOrUpdateRequest request) {
        Products product = new Products();
        product.setColor(request.getColor());
        product.setName(request.getName());
        product.setQuantity(request.getQuantity());
        product.setType(request.getType());
        this.productsDAO.saveOrUpdate(product);
    }

    @Override
    @Transactional
    public void update(Products product) {
        this.productsDAO.update(product);
    }

    @Override
    @Transactional
    public void delete(String  id) {
        this.productsDAO.deleteById(id);
    }
}
