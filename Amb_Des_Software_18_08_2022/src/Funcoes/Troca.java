package Funcoes;

import java.util.Scanner;

public class Troca {
	int a, b;
	
	Scanner s = new Scanner(System.in);	
	
	public Troca(int a, int b) {
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

	public void troca() {
		
		int a = s.nextInt();
		int b = s.nextInt();
		int aux = 0;
		System.out.println("b = "+b);
		System.out.println("a = "+a);}
}
		

