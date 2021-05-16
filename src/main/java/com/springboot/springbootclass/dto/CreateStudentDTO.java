package com.springboot.springbootclass.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateStudentDTO {
    @NotNull
    @Size(min = 2, max = 10)
    private String names;

    @NotNull
    @Size(min = 2, max = 10)
    private String schoolName;

    @Size(min = 2, max = 10)
    private String course;

    @NotNull
    private float totalMarks;

    @NotNull
    private float scoredMarks;

    public CreateStudentDTO() {
    }

    public CreateStudentDTO(String names, String schoolName, String course, float totalMarks, float scoredMarks) {
        this.names = names;
        this.schoolName = schoolName;
        this.course = course;
        this.totalMarks = totalMarks;
        this.scoredMarks = scoredMarks;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getScoredMarks() {
        return scoredMarks;
    }

    public void setScoredMarks(float scoredMarks) {
        this.scoredMarks = scoredMarks;
    }
}
