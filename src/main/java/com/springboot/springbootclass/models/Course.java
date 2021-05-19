package com.springboot.springbootclass.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private  String name;

    @NotNull
    private  int courseCode;

    public Course(){ }

    public Course(String name, int courseCode) {
        this.name = name;
        this.courseCode = courseCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
