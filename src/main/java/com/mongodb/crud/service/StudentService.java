package com.mongodb.crud.service;

import java.util.List;

import com.mongodb.crud.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentByRollNo(int rollNo);
    Student addStudent(Student student);
    Student updateStudent(int rollNo, Student student);
    void deleteStudent(int rollNo);
}
