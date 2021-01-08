package com.nullpointerex.scrummer_test.entity.models;



public abstract class Figura{
	protected double lado;
	
	public Figura(double lado) {
		super();
		
		this.lado= lado;
		}
	
	public abstract double getArea();
	public abstract double getPerimetro();
	public abstract String getTipoFigura();
	
}


