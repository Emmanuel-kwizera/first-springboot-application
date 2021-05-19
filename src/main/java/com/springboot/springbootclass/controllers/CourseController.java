package com.springboot.springbootclass.controllers;

import com.springboot.springbootclass.models.Course;
import com.springboot.springbootclass.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository CourseRepository;

    @GetMapping
    public List<Course> students() {
        return CourseRepository.findAll();
    }

    @PostMapping
    public Course create(@RequestBody Course data) {
        return CourseRepository.save(data);
    }

    @GetMapping(value = "/{id}")
    public Optional<Course> getBook(@PathVariable("id") long id) {
        return CourseRepository.findById(id);
    }

    @PutMapping
    public Course update(@RequestBody Course student) {
        return CourseRepository.save(student);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
        CourseRepository.deleteById(id);
    }
}