package com.springboot.springbootclass.dto;

import com.springboot.springbootclass.models.Course;
import com.springboot.springbootclass.models.Student;
import com.sun.istack.NotNull;

public class CreateMarkDTO {
    @NotNull
    private Student student;

    @NotNull
    private Course course;

    @NotNull
    private float score;

    @NotNull
    private int maximum;

    public CreateMarkDTO(){ }

    public CreateMarkDTO(@NotNull Course course, @NotNull float score,@NotNull Student student,@NotNull int maximum) {
        this.course = course;
        this.score = score;
        this.student = student;
        this.maximum = maximum;
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
