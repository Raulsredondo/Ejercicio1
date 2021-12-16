package com.example.Ejercicio1.model;

public class Edificio {

	private String[][] edificioViviendas;

	public Edificio(Integer plantas, Integer apartamentos) {
		this.edificioViviendas = new String[plantas][apartamentos];
	}

	public String[][] getEdificioViviendas() {
		return edificioViviendas;
	}

	public void setEdificioViviendas(String[][] edificioViviendas) {
		this.edificioViviendas = edificioViviendas;
	}
	
}
