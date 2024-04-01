package com.mongodb.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.crud.model.Student;
import com.mongodb.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByRollNo(int rollNo) {
		
		return studentRepository.findByRollNo(rollNo);
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(int rollNo, Student student) {
	    Student existingStudent = studentRepository.findByRollNo(rollNo);
	            

	    // Update the existing student with new details
	    existingStudent.setName(student.getName());
	    existingStudent.setCourseName(student.getCourseName());
	    existingStudent.setBatch(student.getBatch());


		return studentRepository.save(existingStudent);
	}

	@Override
	public void deleteStudent(int rollNo) {
        studentRepository.deleteByRollNo(rollNo);		
	}

    }
