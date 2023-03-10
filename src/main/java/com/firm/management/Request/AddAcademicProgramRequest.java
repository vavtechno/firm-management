package com.firm.management.Request;

public class AddAcademicProgramRequest {
    private String lessons;
    private String classes;
    private String days;
    private int hours;

    public String getLessons() {
        return lessons;
    }

    public String getClasses() {
        return classes;
    }

    public String getDays() {
        return days;
    }

    public int getHours() {
        return hours;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
