package atividade3;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner grava = new Scanner(System.in);
		
		int cont=1;
		float soma=0;
		float nota=0;
		float media;
		
		while(cont<=10) {
			
			System.out.println("Digite a idade " + cont + ":");
			nota=grava.nextFloat();
			soma+=nota;
			
			cont++;
			
			
		}
		
		media = soma/10;
		System.out.println("A média das 10 idades foi: " + media);
		
	}

}
