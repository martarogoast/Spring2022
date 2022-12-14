package com.martaCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="usuarios")
public class Usuario {
	//Atributos
	@Id
	@Column
	private int codigo;
	@Column
	private String nombre;
	@Column
	private String clave;
	
	//Getters y setters
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
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//Constructores
	public Usuario() {}
	
	public Usuario(int pCodigo, String pNombre, String pClave) {
		codigo = pCodigo;
		nombre = pNombre;
		clave = pClave;
	}
}
