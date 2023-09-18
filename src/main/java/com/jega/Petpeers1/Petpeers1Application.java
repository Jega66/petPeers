package com.jega.Petpeers1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.hcl.cs.dao","com.jega.Petpeers1.Controller","com.hcl.cs.model","com.hcl.cs.service","com.jega.security"})
@EntityScan(basePackages= {"com.hcl.cs.model"})
@EnableJpaRepositories("com.hcl.cs.dao")
public class Petpeers1Application {

	public static void main(String[] args) {
		SpringApplication.run(Petpeers1Application.class, args);
	}

}
