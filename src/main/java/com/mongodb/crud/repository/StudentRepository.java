package com.mongodb.crud.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.mongodb.crud.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Object> {

	

	void deleteByRollNo(int rollNo);

	Student findByRollNo(int rollNo);
}
