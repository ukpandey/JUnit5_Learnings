package com.example.MyCourses;

public class JUnitCourse implements Course {

    @Override
    public boolean purchasedCourse() {
        System.out.println("Junit Course purchased");
        return true;
    }

}
