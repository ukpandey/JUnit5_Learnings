package com.example.MyCourses;

public class SpringBootCourse implements Course{

    @Override
    public boolean purchasedCourse() {
        System.out.println("Spring Boot Course purchased");
        return true;
    }
    
}
