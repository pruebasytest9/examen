package com.bancoplatinum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cta_corriente")
public class CtaCorriente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private int idCuenta;

    @Column(name = "rut_cliente")
    private String rutCliente;

    @Column(name = "monto")
    private double monto;

    @Column(name = "ejecutivo_atiende")
    private String ejecutivoAtiende;

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEjecutivoAtiende() {
		return ejecutivoAtiende;
	}

	public void setEjecutivoAtiende(String ejecutivoAtiende) {
		this.ejecutivoAtiende = ejecutivoAtiende;
	}

    
}

