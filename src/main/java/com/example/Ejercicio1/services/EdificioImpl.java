package com.example.Ejercicio1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Ejercicio1.model.Edificio;

@Service
public class EdificioImpl implements EdificioI {

	private Edificio edificio;
	
	@Override
	public Edificio crearEdificio(Integer plantas, Integer apartamento) {
		edificio = new Edificio(plantas, apartamento);
		System.out.println("Se ha creado el edificio de " + plantas + " plantas y con " + apartamento + " apartamentoamentos en cada planta. \n");
		return edificio;
	}
	
	
	@Override
	public void anadirPersona(String[][] edificio, String nombre, Integer plt, Integer aprt) {
		edificio[plt][aprt] = nombre;
	}

	@Override
	public void mostrarPersonasEdificio(String[][] edificio) {
		for (int x=0; x < edificio.length; x++){
	        for (int y=0; y < edificio[x].length; y++)
	              System.out.print( (edificio[x][y] != null ? edificio[x][y] : "Sin persona") + " esta en el apartamento "+ x + " de la platanta "+y+"     |      ");   
	        System.out.println("\n");
		}
	}

	@Override
	public void buscarPorNombre(String[][] edificio, String nombre) {
		Boolean encontrado = false;
		for (int x=0; x < edificio.length; x++){
	        for (int y=0; y < edificio[x].length; y++) {
	        		if (edificio[x][y] == nombre) {
	        			int planta = x+1;
	        			int apartamento = y+1;
	        			 System.out.println(nombre +" vive en el apartamento " + apartamento + " de la planta " + planta);
	        			 encontrado = true;
	        		}
	        }
		}
		if (!encontrado)
		System.out.println(nombre + " no vive en este edificio.");
	}

	

}
