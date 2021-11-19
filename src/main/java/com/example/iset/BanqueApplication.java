package com.example.iset;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.iset.dao.compteRepository;
import com.example.iset.entity.Compte;


@SpringBootApplication
public class BanqueApplication  implements CommandLineRunner{
	@Autowired
private compteRepository compteRepository;

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Compte c1=new Compte(1, 1200.00, new Date("20/02/2000"));
		Compte c2=new Compte(2, 980.00, new Date("28/05/2020"));
		Compte c3=new Compte(3, 1080.50, new Date("01/03/2018"));
		compteRepository.save(c1);
		compteRepository.save(c2);
		compteRepository.save(c3);
		
}
}
