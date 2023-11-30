package com.bancoplatinum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rut_cliente")
    private String rutCliente;

    @Column(name = "rut_dueno")
    private String rutDueno;

    @Column(name = "id_cuenta")
    private int idCuenta;

    @Column(name = "monto_transferencia")
    private double montoTransferencia;

    @Column(name = "cuenta_destino")
    private String cuentaDestino;

    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getRutDueno() {
		return rutDueno;
	}

	public void setRutDueno(String rutDueno) {
		this.rutDueno = rutDueno;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(double montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

 
}

