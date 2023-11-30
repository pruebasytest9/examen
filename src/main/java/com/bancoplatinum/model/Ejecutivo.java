package com.bancoplatinum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ejecutivo")
public class Ejecutivo {
    @Id
    @Column(name = "rut_ejecutivo")
    private String rutEjecutivo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "departamento")
    private String departamento;

	public String getRutEjecutivo() {
		return rutEjecutivo;
	}

	public void setRutEjecutivo(String rutEjecutivo) {
		this.rutEjecutivo = rutEjecutivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

   
}
