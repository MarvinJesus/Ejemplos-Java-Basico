/*****************************************************************
 * Prog: EntSalida.java
 * Propósito: Probar diferentes tipos de entrada y su salida
 * Creado: Sabado, 03 de Febrero de 2001
 * Modificado:Lunes, 0
 *****************************************************************/

import java.io.*;		//Importamos bibliotecas externas
import javax.swing.*;

class EntSalida{
	
	
	public static void main(String[] args)throws java.io.IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	  	PrintStream out = System.out;	// variables objetos in y out para
	  									// control de teclado y pantalla
		int num1;
		double num2;
		char letra='g';
		String cadena,cadena2,valor;


		out.println("Deme un numero entero");
		num1 = Integer.parseInt(in.readLine());  // solicita un entero
		
		out.println("Deme un numero con decimales");
		num2 = Double.parseDouble(in.readLine());	 // solicita un float

 	    out.print("Deme un caracter ");
		letra = in.readLine().charAt(0);				// solicita un caracter
		
//		letra = (char)in.read();		
//		in.readLine();	

		out.print("Deme una cadena: ");
		cadena = in.readLine();					// solicita una cadena de
												// caracteres
		out.println();
		out.println();							// ponemos espacios
		
		out.println("Lo que Ud. me dio fue:");

		out.println();

		out.println("Un entero: "+ num1);
		out.println("Un numero en decimal: "+ num2);
		out.println("Una letra: "+ letra);
	    out.println("Una cadena: " + cadena);
    	out.println("Mision cumplida, chao :)");
	}
}