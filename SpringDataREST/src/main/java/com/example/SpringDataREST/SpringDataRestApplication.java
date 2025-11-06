package com.example.SpringDataREST;

import com.example.SpringDataREST.entities.Client;
import com.example.SpringDataREST.repositories.clientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.SpringDataREST.entities.Compte;
import com.example.SpringDataREST.entities.TypeCompte;
import com.example.SpringDataREST.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository, clientRepository clientRepository, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Compte.class);

			Client c1 = clientRepository.save(new Client(null, "Amal", null));
			Client c2 = clientRepository.save(new Client(null, "Ali", null));

			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE, c1));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT, c1));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE, c2));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
