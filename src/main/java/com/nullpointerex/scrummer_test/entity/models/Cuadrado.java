package com.nullpointerex.scrummer_test.entity.models;


public class Cuadrado extends Figura{

	public Cuadrado(double lado) {
		super(lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
	
	
	@Override
	public double getPerimetro(){
		return this.lado * 4;
	}

	@Override
	public String getTipoFigura() {
		// TODO Auto-generated method stub
		return "Cuadrado";
	}
	
	
}
