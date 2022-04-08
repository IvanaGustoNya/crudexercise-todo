package com.holysoftware.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class SpringBootAPplicationApplication{


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAPplicationApplication.class, args);
	}

	public String hello() {
		return "SANA MAG WORK NA";
	}



	}

