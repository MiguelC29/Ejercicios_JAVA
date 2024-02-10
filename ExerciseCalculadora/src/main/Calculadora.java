package main;

import java.util.Scanner;

public class Calculadora implements FuncionesCalculadora{
	Scanner teclado = new Scanner(System.in);
	private double numero1, numero2, resultado;
	
	public Calculadora() {
		super();
	}

	public Calculadora(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public double sumar(double numero1, double numero2) {
		this.resultado = this.numero1 + this.numero2;
		return this.resultado;
	}

	@Override
	public double restar(double numero1, double numero2) {
		this.resultado = this.numero1 - this.numero2;
		return this.resultado;
	}

	@Override
	public double multiplicar(double numero1, double numero2) {
		this.resultado = this.numero1 * this.numero2;
		return this.resultado;
	}

	@Override
	public double dividir(double numero1, double numero2) {
		this.resultado = this.numero1 / this.numero2;
		return this.resultado;
	}
}