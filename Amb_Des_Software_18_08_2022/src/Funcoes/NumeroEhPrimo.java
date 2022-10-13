package Funcoes;

public class NumeroEhPrimo {
	int numero;

	public NumeroEhPrimo(int numero) {
		super();
		this.numero = numero;}
	
	public int getNumero() {
		return numero;}
	public void setNumero(int numero) {
		this.numero = numero;}
	
	boolean ehPrimo = false;
	
	public void numeroEhPrimo() {
		int contador = 0;
		
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contador++;}}
		
		if (contador > 2) {
			ehPrimo = false;
		}else {
			ehPrimo = true;}	
		
	}
	
	
	
	

}
