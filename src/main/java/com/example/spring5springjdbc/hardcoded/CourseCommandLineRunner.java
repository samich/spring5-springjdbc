package com.example.spring5springjdbc.hardcoded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
			
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert();
		
	}

}
