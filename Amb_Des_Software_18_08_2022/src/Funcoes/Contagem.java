package Funcoes;

public class Contagem {
	int numero;
	
	public Contagem(int numero) {
		super();
		this.numero = numero;}

	public int getNumero() {
		return numero;}
	public void setNumero(int numero) {
		this.numero = numero;}

	int cont = 0;

	public void contagerm() {
		for(int i = 0; i < numero; i++) {
			cont += 1;}
		
		System.out.println("Existem " + cont + " números entre 0 e " + cont);
	}

}
