package com.firm.management.Request;

import lombok.Data;

@Data
public class CalendarSaveOrUpdateRequest {
    private String lessons;
    private String classes;
    private String days;
    private int hours;
}
