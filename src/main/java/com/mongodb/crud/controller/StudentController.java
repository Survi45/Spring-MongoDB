package com.mongodb.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.crud.model.Student;
import com.mongodb.crud.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/{rollNo}")
    public ResponseEntity<Student> getStudentByRollNo(@PathVariable int rollNo) {
        Student student = studentService.getStudentByRollNo(rollNo);
        return ResponseEntity.ok().body(student);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedStudent);
    }

    @PutMapping("/{rollNo}")
    public ResponseEntity<Student> updateStudent(@PathVariable int rollNo, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(rollNo, student);
        return ResponseEntity.ok().body(updatedStudent);
    }

    @DeleteMapping("/{rollNo}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int rollNo) {
        studentService.deleteStudent(rollNo);
        return ResponseEntity.noContent().build();
    }
}
