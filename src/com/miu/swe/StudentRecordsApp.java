package com.miu.swe;

import com.miu.swe.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentRecordsApp {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");

        Student[] studentArray = {
                new Student(10001, "David", dateFormatter.parse("11/18/1951")),
                new Student(10002, "Alice", dateFormatter.parse("12/07/1990")),
                new Student(10003, "Emily", dateFormatter.parse("01/31/1974")),
                new Student(10004, "Charlie", dateFormatter.parse("08/22/2009")),
                new Student(10005, "Bill", dateFormatter.parse("03/05/1990"))
        };

        displayStudentList(studentArray);  // Displaying all students

        System.out.println("\nStudents with more than 30 years since admission (sorted by admission date):");
        List<Student> veteranAlumni = fetchPlatinumAlumni(studentArray);  // Fetching alumni who are 'platinum'
        for (Student student : veteranAlumni) {
            System.out.println(student);
        }
    }

    // Display sorted list of students
    public static void displayStudentList(Student[] studentArray) {
        System.out.println("Sorted Student List (By Name):");

        List<Student> studentList = Arrays.asList(studentArray);
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        studentList.forEach(System.out::println);
    }

    // Fetch students who have been part of the institution for over 30 years
    public static List<Student> fetchPlatinumAlumni(Student[] studentArray) {
        List<Student> veteranAlumni = new ArrayList<>();
        Date today = new Date();

        for (Student student : studentArray) {
            long yearsPassed = (today.getTime() - student.getDateOfAdmission().getTime()) / (1000L * 60 * 60 * 24 * 365);
            if (yearsPassed >= 30) {
                veteranAlumni.add(student);
            }
        }

        Collections.sort(veteranAlumni, (s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()));
        return veteranAlumni;
    }
}