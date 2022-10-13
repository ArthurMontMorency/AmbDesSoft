import java.util.Scanner;

import Funcoes.Contagem;
import Funcoes.Fibonacci;
import Funcoes.MDC;
import Funcoes.NumeroEhPrimo;
import Funcoes.Ordenacao;
import Funcoes.Somatorio;
import Funcoes.Troca;

public class Implementacao {
	
	public void mensagemInicial() {
		
		System.out.println("Selecione qual operação deseja realizar!");
		
		System.out.println("Opção 1: Número é primo");			//OK
		System.out.println("Opção 2: Troca");
		System.out.println("Opção 3: Somatório");				//OK
		System.out.println("Opção 4: Fibonacci");				//OK
		System.out.println("Opção 5: Máximo Divisor Comum");	//OK
		System.out.println("Opção 6: Ordenação");
		System.out.println("Opção 7: Contador simples");		//OK
	}
	
	Scanner s = new Scanner(System.in);
	
	
	public void implementacao() {
		int entrada = s.nextInt();
		
		if (entrada == 1) {
			int numero = s.nextInt();
			NumeroEhPrimo numeroEhPrimo= new NumeroEhPrimo(numero);
			numeroEhPrimo.numeroEhPrimo();
			
		}else if (entrada == 2) {
			int a = s.nextInt();
			int b = s.nextInt();
			Troca troca = new Troca(a,b);
			troca.troca();
		
		}else if (entrada == 3) {
			int quantidadeNumeros = s.nextInt();
			Somatorio somatorio = new Somatorio();
			somatorio.somatorio();
			
		}else if (entrada == 4) {
			int numeroFinal = s.nextInt();
			Fibonacci fibonacci = new Fibonacci(numeroFinal);
			fibonacci.fibonacci();
		
		}else if (entrada == 5) {
			int a = s.nextInt();
			int b = s.nextInt();
			MDC mdc = new MDC(a,b);
			mdc.mdc();
			
		}else if (entrada == 6) {
			Ordenacao ordenacao = new Ordenacao();
			ordenacao.ordenacao();
			
		}else if (entrada == 7) {
			int numero = s.nextInt();
			Contagem contagem = new Contagem(numero);
			contagem.contagerm();
		
		}else {
			System.out.println("Opção não encontrada! Digite novamente!");
			mensagemInicial();
			implementacao();
		}
		
	}
	
	
	
	
	
	

}
