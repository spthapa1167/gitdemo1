package com.s3.git.gitdemo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gitdemo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Gitdemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is my first springboot maven project");
		///////
	}
}
