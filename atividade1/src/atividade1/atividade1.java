package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		Scanner grava = new Scanner(System.in);
		
		int cem = 100;
		
		while(cem<200) {
			cem++;
			if (cem%2 == 1) {
				System.out.print(cem );
			}
		}

	}

}
