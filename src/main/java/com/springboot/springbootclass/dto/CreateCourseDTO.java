package com.springboot.springbootclass.dto;

import com.sun.istack.NotNull;

public class CreateCourseDTO {
    @NotNull
    private String name;

    @NotNull
    private  int courseCode;

    public CreateCourseDTO() {
    }

    public CreateCourseDTO(String name,int courseCode){
        this.name = name;
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
}
