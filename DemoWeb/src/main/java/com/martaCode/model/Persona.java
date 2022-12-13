package com.martaCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {

	//atributos
	@Id
	private int codigo;
	@Column
	private String nombre;
	
	//getters y setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructores
	public Persona(int pCod, String pNom) {
		codigo = pCod;
		nombre = pNom;
	}
}
