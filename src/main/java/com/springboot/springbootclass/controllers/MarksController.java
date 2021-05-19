package com.springboot.springbootclass.controllers;

import com.springboot.springbootclass.models.Marks;
import com.springboot.springbootclass.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marks")
public class MarksController {

    @Autowired
    private MarksRepository MarksRepository;

    @GetMapping
    public List<Marks> students() {
        return MarksRepository.findAll();
    }

    @PostMapping
    public Marks create(@RequestBody Marks data) {
        return MarksRepository.save(data);
    }

    @GetMapping(value = "/{id}")
    public Optional<Marks> getBook(@PathVariable("id") long id) {
        return MarksRepository.findById((int) id);
    }

    @PutMapping
    public Marks update(@RequestBody Marks student) {
        return MarksRepository.save(student);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
        MarksRepository.deleteById((int) id);
    }
}
