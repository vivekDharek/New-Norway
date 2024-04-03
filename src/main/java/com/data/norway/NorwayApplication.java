package com.data.norway;

import org.neo4j.driver.Driver;
//import org.neo4j.driver.Driver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class NorwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorwayApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(Driver driver) {
		return args -> {
			int nodes = driver.session().readTransaction(tx ->tx.run("MATCH (n) return count(*) as nodes").single().get("nodes").asInt());
			System.out.println(nodes);
		};
	}


}
