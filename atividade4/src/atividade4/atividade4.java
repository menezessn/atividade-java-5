package atividade4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner grava = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes que voc� quer a mensagem apare�a: ");
		int vezes = grava.nextInt();
	
		
		
		
		while(vezes>0) {
		System.out.println(vezes + ".isso � um teste! ");
		vezes--;
		}

	}

}
