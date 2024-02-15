package com.example.MyCourses;

public class JavaCourse implements Course {
    @Override
    public boolean purchasedCourse() {
        System.out.println("Java Course purchased");
        return true;
    }
}
