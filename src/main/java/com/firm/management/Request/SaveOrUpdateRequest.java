package com.firm.management.Request;

import lombok.Data;

@Data
public class SaveOrUpdateRequest {

    private String name;

    private String type;

    private String quantity;

    private String color;
}
