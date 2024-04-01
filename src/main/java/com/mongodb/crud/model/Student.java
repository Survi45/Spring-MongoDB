package com.mongodb.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "students")
public class Student {
    @Id
    private Object id;
    private String name;
    @Field("roll_no")
    private int rollNo;
    @Field("course_name")
    private String courseName;
    private int batch;
    
	public Object getId() {
		return id;
	}
	public void setId(Object id2) {
		this.id = id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
    

    
}

