//package OperacionesGeometricas;
//package com.zubiri.geometria;
import java.util.Scanner;

import com.zubiri.geometria.Circulos;
import com.zubiri.geometria.Rectangulo;
//import com.zubiri.geometria.Pruebas;
//import aa.Rectangulo;

public class OperacionesGeometricas
{
	public static void main (String args[])
	{
		String figura;

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Sobre que figura geometrica desea realizar las operaciones, ¿Circulo (C) o Rectangulo (R)?");
		figura = sc.nextLine();

		if (figura.equals ("C") || figura.equals ("Circulo"))
		{
			double numero1, resultadoArea, resultadoCircunferencia;
			Circulos operaciones = new Circulos();
		
			System.out.print("\nIngresa un número: ");
			numero1 = sc.nextDouble(); // nextDouble --> Cambiar todos los float de los dos archivos a double
			operaciones.setArea(numero1);
			operaciones.setCircunferencia(numero1);

			resultadoArea = operaciones.getArea();
			resultadoCircunferencia = operaciones.getCircunferencia();


			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
	
			//System.out.println("\n\nEGUN ONA IZAN!!\n");
		}
		else if (figura.equals ("R") || figura.equals ("Rectangulo"))
		{
			double alt, bs, resultadoArea, resultadoPerimetro;
			Rectangulo operacionesR = new Rectangulo();

			System.out.println("\nHas seleccionado el rectangulo");

			System.out.print("\nIngresa la altura del rectangulo: ");
			alt = sc.nextDouble();

			System.out.print("\nIngresa la base del rectangulo: ");
			bs = sc.nextDouble();

			operacionesR.setArea(alt, bs);
			operacionesR.setPerimetro(alt, bs);

			resultadoArea = operacionesR.getArea();
			resultadoPerimetro = operacionesR.getPerimetro();

			System.out.println("\nEl AREA del rectangulo es: " + resultadoArea + "cm");
			System.out.println("\nEl PERIMETRO del rectangulo es: " + resultadoPerimetro + "cm");
		}
		else
		{
			System.out.println("\n Debes introducir C (Ciruclo) o R (Rectangulo)");
		}
	}
}
