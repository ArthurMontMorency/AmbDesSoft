package Funcoes;

public class MDC {
	int a,b;

	public MDC(int a, int b) {
		super();
		this.a = a;
		this.b = b;}
	
	public int getA() {
		return a;}
	public void setA(int a) {
		this.a = a;}
	public int getB() {
		return b;}
	public void setB(int b) {
		this.b = b;}
	
	int menorNumero = 0;
	
	public void qualMaior() {
		if (a > b) {
			menorNumero = b;
		}else if (a < b) {
			menorNumero = a;}}
	
	int maiorDivisorComum = 0;
	int cont = 0;
	
	public void calculaMDC() {
		for (int i = 0; i < menorNumero; i++) {
			cont ++;
			if((a % cont == 0) && (b % cont == 0)){
				maiorDivisorComum = cont;}}}
	
	public void mostra() {
		System.out.println("MDC de " + a + " e " + b + ": " + maiorDivisorComum);
	}
	
	public void mdc() {
		qualMaior();
		calculaMDC();
		mostra();
		
	}
	
	
	

}
