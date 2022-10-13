package Funcoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
	
	public void ordenacao() {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe quantos números irá adicionar:");
		
		int numeroEntradas = s.nextInt();
		
		int entrada;
		int[] lista = new int[numeroEntradas];
		
		System.out.println("Agora informe as " + numeroEntradas
				+ " entradas, uma por uma, teclando Enter depois");		
		
		for (int i = 0; i < numeroEntradas; i++) {
			entrada = s.nextInt();
			lista[i] = entrada;}
		
		Arrays.sort(lista);
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		
	}

}
