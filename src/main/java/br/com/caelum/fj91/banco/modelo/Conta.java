package br.com.caelum.fj91.banco.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

public class Conta {

	private BigDecimal saldo = BigDecimal.ZERO;
	private BigDecimal limite = BigDecimal.ZERO;
	
	private Cliente titular;
	private int numero;
	private Calendar dataAbertura;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}

	public BigDecimal getLimite() {
		return limite;
	}
	
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "{Conta #" + this.numero + "}";
	}
	
}
