package Funcoes;
import java.util.ArrayList;

public class Fibonacci {
	int numeroFinal;
	
	public Fibonacci(int numeroFinal) {
		super();
		this.numeroFinal = numeroFinal;}

	public int getNumeroFinal() {
		return numeroFinal;}
	public void setNumeroFinal(int numeroFinal) {
		this.numeroFinal = numeroFinal;}
	
	ArrayList<Integer> arrayFibonacci = new ArrayList<Integer>();	
	
	public void fibonacci() {
		arrayFibonacci.add(1);
		arrayFibonacci.add(1);
		
		int cont0 = 0;
		int cont1 = 1;
		
		int add = 0;
		
		System.out.println(arrayFibonacci.get(0));
		System.out.println(arrayFibonacci.get(1));
		
		while (add < numeroFinal) {
			add = arrayFibonacci.get(cont0) + arrayFibonacci.get(cont1);
			
			arrayFibonacci.add(add);
			
			cont0++;
			cont1++;
			
			System.out.println(add);
			
		}
		
		
	}
	

}
