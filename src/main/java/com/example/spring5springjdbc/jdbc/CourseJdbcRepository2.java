package com.example.spring5springjdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.spring5springjdbc.course.Course;

@Repository
public class CourseJdbcRepository2 {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into course (id, name, author)
			values(?, ?, ?);
			""";

	public void insert(Course course) {
		
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

}
