package com.example.fitnessclubapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.fitnessclubapp.*")
@ComponentScan(basePackages = "com.example.fitnessclubapp")
@EntityScan("com.example.fitnessclubapp.*")
public class FitnessclubappApplication {

  public static void main(String[] args) {

    SpringApplication.run(FitnessclubappApplication.class, args);
  }

}
