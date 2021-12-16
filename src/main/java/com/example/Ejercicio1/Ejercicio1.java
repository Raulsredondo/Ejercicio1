package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Ejercicio1.model.Edificio;
import com.example.Ejercicio1.services.EdificioI;

@SpringBootApplication
public class Ejercicio1 implements CommandLineRunner {

	@Autowired
	private EdificioI edificio1;	
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("La aplicación ha arrancado.");
		Edificio edificioViviendas = this.edificio1.crearEdificio(3, 3);
		
		String[][] Viviendas = edificioViviendas.getEdificioViviendas();
		edificio1.anadirPersona(Viviendas, "Pedro", 0, 0);
		edificio1.anadirPersona(Viviendas, "Ana", 0, 1);
		edificio1.anadirPersona(Viviendas, "Manolo", 1, 0);
		edificio1.anadirPersona(Viviendas, "Pablo", 1, 2);
		edificio1.anadirPersona(Viviendas, "Manolo", 2, 2);
		
		edificio1.mostrarPersonasEdificio(Viviendas);
		
		edificio1.buscarPorNombre(Viviendas, "Pablo");
	}

}
