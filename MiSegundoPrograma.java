/*****************************************************************
 * Prog: HolaMundo.java
 * Propósito: Primer programa
 * Creado: Sabado, 03 de Febrero de 2015
 * Modificado:
 *****************************************************************/

import java.io.*;		//Importamos bibliotecas externas

public class MiSegundoPrograma{	

	public static void main(String[] args)throws java.io.IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		String nombre;
		
		out.println("Deme su nombre");
		nombre = in.readLine();
		
		out.println("Te saludo "+ nombre + " bienvenido a este mundo");
	}
}