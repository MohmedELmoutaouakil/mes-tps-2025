package com.example.TPRestController;

import com.example.TPRestController.entities.Compte;
import com.example.TPRestController.entities.TypeCompte;
import com.example.TPRestController.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpRestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpRestControllerApplication.class, args);
	}

}
