package com.springboot.springbootclass.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Marks {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @ManyToOne
    private Student student;

    @NotNull
    @ManyToOne
    private Course course;

    @NotNull
    private float score;

    @NotNull
    private int maximum;

    public Marks(){}

    public Marks(@NotNull Course course, @NotNull float score,@NotNull Student student,@NotNull int maximum) {
        this.course = course;
        this.score = score;
        this.student = student;
        this.maximum = maximum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
