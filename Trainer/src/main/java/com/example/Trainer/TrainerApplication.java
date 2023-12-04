package com.example.Trainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;



@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
		info = @Info(
				title = "Department-Service",
				description = "Department-service Doc",
				version = "v1.0",
				contact = @Contact(
						name = "Surya",
						email = "Surya@gmail.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.udemy.com/"
				)
		),
		externalDocs =  @ExternalDocumentation(
				description = "Department-service Doc",
				url = "https://www.udemy.com/"
		)
)
public class TrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainerApplication.class, args);
	}

}
