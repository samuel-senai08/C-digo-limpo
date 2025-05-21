package Projetoscodigolimpo;

import java.util.Scanner;

public class Codigo1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	int numero;
	System.out.println(" Informe um valor: ");
	numero = scanner.nextInt();
	scanner.close();
	String mensagem = numero % 5 == 0 ? " Multiplo de 5" : " Não é multiplo de 5";
	System.out.println(mensagem);
		
		
	}
	}




