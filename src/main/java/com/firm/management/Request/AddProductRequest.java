package com.firm.management.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductRequest {
    private String name;
    private String type;
    private String quantity;
    private String color;


}
