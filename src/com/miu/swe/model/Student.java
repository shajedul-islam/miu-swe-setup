package com.miu.swe.model;

import java.util.Date;

public class Student {
    private int studentId;
    private String name;
    private Date dateOfAdmission;

    //Default constractor
    public Student() {
    }

    //Parameterized Constructor
    public Student(int studentId, String name, Date dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    //Parameterized Constructor
    public Student(String name, Date dateOfAdmission) {
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    // StudentID getter
    public int getStudentId() {
        return studentId;
    }

    // StudentID setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Student name getter
    public String getName() {
        return name;
    }

    // Student name setter
    public void setName(String name) {
        this.name = name;
    }

    // date of admission getter
    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    // date of admission setter
    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    //Override toString method
    @Override
    public String toString() {
        return "Student Info: [" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                ']';
    }
}