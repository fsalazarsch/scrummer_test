package com.nullpointerex.scrummer_test.entity.models;

public class Circulo extends Figura{
	//lado es el radio 
	public Circulo(double lado) {
		super(lado);
		// TODO Auto-generated constructor stub
	}
	
	public double getDiametro() {
		return 2 * this.lado;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.lado, 2);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * lado;
	}

	@Override
	public String getTipoFigura() {
		// TODO Auto-generated method stub
		return "Circulo";
	}

}
