package Projetoscodigolimpo;

import java.util.Scanner;

public class Codigo2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println(" Cadastre uma senha (Apenas números): ");
	int senha = scanner.nextInt();
	
	System.out.println(" Digite um numero: ");
	int numero1 = scanner.nextInt();
	
	System.out.println(" Digite um segundo número: ");
	int numero2 = scanner.nextInt();
	
	System.out.println(" Digite sua senha para desbloquear: ");
	int senhaTentativa = scanner.nextInt();
	scanner.close();
	
	String resultado = senhaTentativa == senha ? "A Senha está correta, o resultado é " + (numero1 + numero2) : "Incorreto";
	System.out.println(resultado);
	
	}
}
