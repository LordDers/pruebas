/*
	Rectangulo
*/
package com.zubiri.geometria;
public class Rectangulo 
{
	private double v_area;
	private double v_perimetro;

	// Metodo para calcular el area (altura * base)
	// Recoge las variables enviadas desde operacionesRectangulo.java (operaciones.setArea(alt, bs);)
	public void setArea (double altura, double base) 
	{
		this.v_area = altura*base;
	}

	// Metodo para calcular el perimetro (altura + altura + base + base)
	// Recoge las variables enviadas desde operacionesRectangulo.java (operaciones.setPerimetro(alt, bs);)
	public void setPerimetro (double altura, double base) 
	{
		this.v_perimetro = altura*2 + base*2;
	}

	// Envia el valor de v_area a operacionesRectangulo.java
	public double getArea()
	{
		return v_area;
	}

	// Envia el valor de v_perimetro a operacionesRectangulo.java
	public double getPerimetro()
	{
		return v_perimetro;
	}

}
