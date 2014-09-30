/*
	Radio
*/
package com.zubiri.geometria;
public class Circulos 
{
	private double area;
	private double circunferencia = 0;
	private double radio;

	//Metodo para calcular el radio
	public void setRadio (double rad) 
	{
		this.radio = rad;
		//this.area = 3.1416f * (radio * radio);
		//this.circunferencia = 2 * 3.1416f * radio;
	}

	public void setArea (double rad) 
	{
		this.area = 3.1416f * (rad * rad);
	}

	public void setCircunferencia (double rad) 
	{
		this.circunferencia = 2 * 3.1416f * rad;
	}

	public double getArea()
	{
		return area;
	}

	public double getCircunferencia()
	{
		return circunferencia;
	}

}
