package com.example.spring5springjdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5springjdbc.course.Course;

@Component
public class CourseCommandLineRunner2 implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository2 repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(3, "Azure Developer", "Kenneth Bryan"));
		repository.insert(new Course(4, "Alibaba Cloud", "Barbara Martin"));
		repository.insert(new Course(5, "AWS Practitioner", "Joseph Reed"));
		
	}
	
	

}

