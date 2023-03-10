package com.firm.management.Request;

public class AddOrderRequest {
    private String brand;
    private String type;
    private boolean stock;
    private String customer;


    public String getBrand() {
        return brand;
    }
    public String getType() {
        return type;
    }
    public boolean getStock() {
        return stock;
    }

    public String getCustomer() {
        return customer;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

}
