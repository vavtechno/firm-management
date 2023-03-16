package com.firm.management.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddTeachersRequest {
    private String name;
    private String surname;
    private int phone;
    private String branch;
}
