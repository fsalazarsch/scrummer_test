package com.nullpointerex.scrummer_test.entity.models;

import java.util.Optional;

public class Triangulo extends Figura {
	//lado es base
	private double lado2;
	private double lado3;

	public Triangulo(double lado, double lado2, double lado3) {
		super(lado);
		this.lado3 = lado3;
		this.lado2 = lado2;
		// TODO Auto-generated constructor stub
	}

	public double getLado2() {

		return lado2;
	}

	public void setLado2(double lado2) {

		this.lado2 = lado2;
	}

	public double getLado3() {

		return lado3;
	}

	public void setLado3(double lado3) {

		this.lado3 = lado3;
	}
	


	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (this.lado + this.lado2 + this.lado3);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double semiperimetro = this.getPerimetro()/2;

		return Math.sqrt( semiperimetro * (semiperimetro -this.lado) *(semiperimetro -this.lado2) *(semiperimetro -this.lado3) );

	}
	@Override
	public String getTipoFigura() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}
	
}
