/*****************************************************************
 * Prog: HolaMundo.java
 * Propósito: Primer programa
 * Creado: Sabado, 03 de Febrero de 2015
 * Modificado:
 *****************************************************************/

import java.io.*;		//Importamos bibliotecas externas

public class MiCuartoPrograma{	

	public static void main(String[] args)throws java.io.IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		String nombre;
		int edad, numPers;
		String msj;
		int i=0;
		
		out.println("Cuantas personas procesara");
		numPers = Integer.parseInt(in.readLine());  // solicita un entero
			
		
		while(i<numPers){
		
			out.println("Deme su nombre");
			nombre = in.readLine();
			
			out.println("Deme su edad");
			edad = Integer.parseInt(in.readLine());  // solicita un entero
			
			if(edad>=18){
				
				msj= nombre + " ya sos mayorcito";
			}else{
				
				msj= nombre + " estas de chupon";
				
			}		
			out.println(msj);
			i=i+1;
		}
	}
}