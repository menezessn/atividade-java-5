package atividade4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner grava = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes que você quer a mensagem apareça: ");
		int vezes = grava.nextInt();
	
		
		
		
		while(vezes>0) {
		System.out.println(vezes + ".isso é um teste! ");
		vezes--;
		}

	}

}
