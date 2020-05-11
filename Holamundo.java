/*****************************************************************
 * Prog: HolaMundo.java
 * Propósito: Primer programa
 * Creado: Sabado, 03 de Febrero de 2015
 * Modificado:
 *****************************************************************/

import java.io.*;		//Importamos bibliotecas externas

public class Holamundo{	
				
	public static void main(String[] args)throws java.io.IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
									
	   out.println("Hola Mundo");
	}
}