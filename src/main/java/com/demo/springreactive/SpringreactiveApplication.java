package com.demo.springreactive;

import com.demo.springreactive.student.Student;
import com.demo.springreactive.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringreactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactiveApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			StudentService studentService
//	){
//		return args -> {
//			for(int i=0; i<100; i++){
//				studentService.save(
//						Student.builder()
//								.firstname("Mahammad"+i)
//								.lastname("Isayev"+i)
//								.age(i)
//								.build()
//				).subscribe();
//			}
//		};
//	}
}
