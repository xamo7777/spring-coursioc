package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.models.Guitare;
import com.example.models.guitariste;


// permet de déclarer un composant configurant le contexte de l'application
@configuration
@ComponentScan({ "com.example.*" }) // à partir de la racine, il scanne tous les packages*
public class AppConfig {

	// un bean est un objet qui est instancié, assemblé et géré par la factory de
	// SpringCore
	@Bean(name = "guitariste1")
	public guitariste guitariste() {
		return new (1, "Doe", "John");
	}

	@Bean(name = "language")
	public Guitare getPlay() {
		return new Guitare();
	}
}