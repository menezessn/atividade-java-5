package atividade4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner grava = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes que voc� quer a mensagem apare�a: ");
		int vezes = grava.nextInt();
	
		
		int x=1;
		
		while(x<=vezes) {
		System.out.println(x + ".isso � um teste! ");
		x++;
		}

	}

}
