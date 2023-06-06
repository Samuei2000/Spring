package com.sxy.cruddemo;

import com.sxy.cruddemo.dao.StudentDAO;
import com.sxy.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			createStudent(studentDAO);
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new Student object....");
		Student tempStudent=new Student("Paul","Doe","paul@gmail,com");
		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		//display id of the saved student
		System.out.println("Saved student. Generated id:"+tempStudent.getId());
	}
}
