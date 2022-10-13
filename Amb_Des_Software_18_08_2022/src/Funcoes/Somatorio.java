package Funcoes;
import java.util.ArrayList;
import java.util.Scanner;

public class Somatorio {

	ArrayList<Double>lista = new ArrayList<Double>();
	
	Scanner s = new Scanner(System.in);
	
	int quantidadeNumeros = s.nextInt();
	
	double cont = 0;
	
	public void preencheLista() {
		for(int i = 0; i < quantidadeNumeros; i++) {
			double numero = s.nextDouble();
			lista.add(numero);}}
	
	public void somaLista() {
		for(int i = 0; i < lista.size(); i++) {
			cont += lista.get(i);}}
	
	public void mostra() {
		System.out.println("Soma total de todos os números = " + cont);}
	
	public void somatorio() {
		preencheLista();
		somaLista();
		mostra();}
	
	

}
